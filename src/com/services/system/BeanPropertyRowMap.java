package com.services.system;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.util.StringUtils;

import java.beans.PropertyDescriptor;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;
import java.util.*;

/**
 * Created by rcl on 2016/1/9.
 * map转换成bean  并且可以直接忽视 a_b与aB写法区别
 */
public class BeanPropertyRowMap<T> {

    private Class<T> mappedClass;

    private Map<String, PropertyDescriptor> mappedFields;

    private Set<String> mappedProperties;


    public BeanPropertyRowMap() {

    }


    private void initialize(Class mappedClass) {
            this.mappedClass = mappedClass;
            this.mappedFields = new HashMap<String, PropertyDescriptor>();
            this.mappedProperties = new HashSet<String>();
            PropertyDescriptor[] pds = BeanUtils.getPropertyDescriptors(mappedClass);
            for (PropertyDescriptor pd : pds) {
                if (pd.getWriteMethod() != null) {
                    this.mappedFields.put(pd.getName().toLowerCase(), pd);
                    String underscoredName = underscoreName(pd.getName());
                    if (!pd.getName().toLowerCase().equals(underscoredName)) {
                        this.mappedFields.put(underscoredName, pd);
                    }
                    this.mappedProperties.add(pd.getName());
                }
            }

    }

    public String underscoreName(String name) {
        if (!StringUtils.hasLength(name)) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        result.append(name.substring(0, 1).toLowerCase());
        for (int i = 1; i < name.length(); i++) {
            String s = name.substring(i, i + 1);
            String slc = s.toLowerCase();
            if (!s.equals(slc)) {
                result.append("_").append(slc);
            } else {
                result.append(s);
            }
        }
        return result.toString();
    }

    public T mapRow(Map<String, Object> map) {
        if(map==null || map.size()==0){
            return null;
        }
        T mappedObject = BeanUtils.instantiate(mappedClass);
        BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(mappedObject);

            Iterator<Map.Entry<String,Object>> iterator = map.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<String,Object> entry = iterator.next();
                String column = entry.getKey();
                PropertyDescriptor pd = this.mappedFields.get(column.replaceAll(" ", "").toLowerCase());
                if(pd!=null){
                    Object value = entry.getValue();
                    try {
                        //部分字段都直接设置的String 预先对String字段进行处理 毕竟数据库返回的可能不是String
                        if(String.class.equals(pd.getPropertyType()) && value!=null){
                            value = value.toString();
                        }
                        bw.setPropertyValue(pd.getName(), value);
                    }
                    catch (TypeMismatchException e) {
                        e.printStackTrace();
                    }
                }
            }
        return mappedObject;
    }


    public List<T> mapRow(List<Map<String,Object>> mapList){
        if(mapList==null || mapList.size()==0)
            return null;
        List<T> list = new ArrayList<>();
        for(Map<String,Object> map : mapList){
            list.add(mapRow(map));
        }
        return list;
    }

    public static <T> BeanPropertyRowMap<T> newInstance(Class<T> mappedClass) {
        BeanPropertyRowMap<T> newInstance = new BeanPropertyRowMap<T>();
        newInstance.setMappedClass(mappedClass);
        return newInstance;
    }

    private void setMappedClass(Class<T> mappedClass) {
        if (this.mappedClass == null) {
            initialize(mappedClass);
        }
        else {
            if (!this.mappedClass.equals(mappedClass)) {
                throw new NullPointerException("The mapped class can not be reassigned to map to " +
                        mappedClass + " since it is already providing mapping for " + this.mappedClass);
            }
        }
    }

}
