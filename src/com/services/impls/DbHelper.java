package com.services.impls;

import com.annotations.RmiReference;
import com.beans.DbTask;
import com.beans.Types;
import com.interfaces.QshDbSuperInterface;
import com.services.system.BeanPropertyRowMap;
import com.services.tools.SqlXmlRead;
import org.springframework.beans.*;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by rcl on 2016/1/9.
 */
@Service
public class DbHelper {

    @RmiReference(serverType = Types.DB)
    public QshDbSuperInterface qshDbSuperInterface;

    public <T> T transfer(Class<T> clazz,Map<String,Object> map){
        return BeanPropertyRowMap.newInstance(clazz).mapRow(map);
    }
    public <T> List<T>  transfer(Class<T> clazz,List<Map<String,Object>> mapList){
        return BeanPropertyRowMap.newInstance(clazz).mapRow(mapList);
    }

    public <T> T querySingle(int taskId,Object[] paramValues,int [] paramTypes,Class<T> clazz){
        return transfer(clazz,querySingleMap(taskId,paramValues,paramTypes));
    }
    public <T> T querySingle(int taskId,Object[] paramValues,Class<T> clazz){
        return transfer(clazz,querySingleMap(taskId, paramValues));
    }
    public Map<String,Object> querySingleMap(int taskId,Object[] paramValues,int [] paramTypes){
        String sql  = SqlXmlRead.getSQL(taskId);
        return qshDbSuperInterface.querySingleMap(sql, paramValues, paramTypes);
    }
    public Map<String,Object> querySingleMap(int taskId,Object[] paramValues){
        String sql  = SqlXmlRead.getSQL(taskId);
        return qshDbSuperInterface.querySingleMap(sql, paramValues);
    }
    public <T> T querySingleMainServer(int taskId,Object[] paramValues,int [] paramTypes,Class<T> clazz){
        return transfer(clazz,querySingleMapMainServer(taskId,paramValues,paramTypes));
    }
    public <T> T querySingleMainServer(int taskId,Object[] paramValues,Class<T> clazz){
        return transfer(clazz,querySingleMapMainServer(taskId,paramValues));
    }
    public Map<String,Object> querySingleMapMainServer(int taskId,Object[] paramValues,int [] paramTypes){
        String sql  = SqlXmlRead.getSQL(taskId);
        return qshDbSuperInterface.querySingleMapMainServer(sql, paramValues, paramTypes);
    }
    public Map<String,Object> querySingleMapMainServer(int taskId,Object[] paramValues){
        String sql  = SqlXmlRead.getSQL(taskId);
        return qshDbSuperInterface.querySingleMapMainServer(sql, paramValues);
    }
    public List<Map<String,Object>> queryMap(int taskId,Object[] paramValues,int [] paramTypes){
        String sql  = SqlXmlRead.getSQL(taskId);
        return qshDbSuperInterface.queryMap(sql, paramValues, paramTypes);
    }
    public List<Map<String,Object>> queryMap(int taskId,Object[] paramValues){
        String sql  = SqlXmlRead.getSQL(taskId);
        return qshDbSuperInterface.queryMap(sql, paramValues);
    }
    public List<Map<String,Object>> queryMapMainServer(int taskId,Object[] paramValues,int [] paramTypes){
        String sql  = SqlXmlRead.getSQL(taskId);
        return qshDbSuperInterface.queryMapMainServer(sql, paramValues, paramTypes);
    }
    public List<Map<String,Object>> queryMapMainServer(int taskId,Object[] paramValues){
        String sql  = SqlXmlRead.getSQL(taskId);
        return qshDbSuperInterface.queryMapMainServer(sql, paramValues);
    }

    public List<Map<String,Object>> queryMapMainServer(int taskId){
        String sql  = SqlXmlRead.getSQL(taskId);
        return qshDbSuperInterface.queryMapMainServer(sql);
    }

    public List<Map<String,Object>> queryMap(int taskId){
        String sql  = SqlXmlRead.getSQL(taskId);
        return qshDbSuperInterface.queryMap(sql);
    }


    public <T> List<T> queryList(int taskId, Object[] paramValues, int[] paramTypes, Class<T> clazz){
        return transfer(clazz, queryMap(taskId, paramValues, paramTypes));
    }
    public <T> List<T> queryList(int taskId, Class<T> clazz){
        return transfer(clazz, queryMap(taskId));
    }
    public <T> List<T> queryList(int taskId, Object[] paramValues, Class<T> clazz){
        return transfer(clazz, queryMap(taskId, paramValues));
    }
    public <T> List<T> queryListMainServer(int taskId, Class<T> clazz){
        return transfer(clazz, queryMapMainServer(taskId));
    }
    public <T> List<T> queryListMainServer(int taskId, Object[] paramValues, int[] paramTypes, Class<T> clazz){
        return transfer(clazz,queryMapMainServer(taskId,paramValues,paramTypes));
    }
    public <T> List<T> queryListMainServer(int taskId, Object[] paramValues, Class<T> clazz){
        return transfer(clazz,queryMapMainServer(taskId,paramValues));
    }
    public void insertBatch(int taskId, List<Object[]> params){
        String sql  = SqlXmlRead.getSQL(taskId);
        qshDbSuperInterface.insertBatch(sql, params);
    }
    public int update(int taskId, Object[] params){
        String sql  = SqlXmlRead.getSQL(taskId);
        return qshDbSuperInterface.update(sql,params);
    }
    public int update(int taskId, Object[] params, int[] paramsType){
        String sql  = SqlXmlRead.getSQL(taskId);
        return qshDbSuperInterface.update(sql,params,paramsType);
    }

    public int update(int taskId){
        String sql  = SqlXmlRead.getSQL(taskId);
        return qshDbSuperInterface.update(sql);
    }

    /**
     *
     * @param list  带事务处理的批量更新操作
     * @return
     */
    public List<DbTask> batchUpdate(List<DbTask> list){
        for(DbTask dbTask : list){
            dbTask.setSql(SqlXmlRead.getSQL(dbTask.getTaskId()));
        }
        return qshDbSuperInterface.batchUpdate(list);
    }

    /**
     *
     * @param list  不带事务处理的批量更新操作
     * @return
     */
    public List<DbTask> batchUpdateNoTransaction(List<DbTask> list){
        for(DbTask dbTask : list){
            dbTask.setSql(SqlXmlRead.getSQL(dbTask.getTaskId()));
        }
        return qshDbSuperInterface.batchUpdateNoTransaction(list);
    }

}
