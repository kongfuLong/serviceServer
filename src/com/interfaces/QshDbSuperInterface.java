package com.interfaces;



import com.beans.DbTask;

import java.util.List;
import java.util.Map;

/**
 * Created by rcl on 2016/1/6.
 */
public interface QshDbSuperInterface {

    void test();

    Map<String,Object> querySingleMap(String sql, Object[] paramValues, int[] paramTypes);

    Map<String,Object> querySingleMap(String sql, Object[] paramValues);

    Map<String,Object> querySingleMapMainServer(String sql, Object[] paramValues, int[] paramTypes);

    Map<String,Object> querySingleMapMainServer(String sql, Object[] paramValues);

    List<Map<String,Object>> queryMap(String sql, Object[] paramValues, int[] paramTypes);

    List<Map<String,Object>> queryMap(String sql, Object[] paramValues);

    List<Map<String,Object>> queryMap(String sql);

    List<Map<String,Object>> queryMapMainServer(String sql);

    List<Map<String,Object>> queryMapMainServer(String sql, Object[] paramValues, int[] paramTypes);

    List<Map<String,Object>> queryMapMainServer(String sql, Object[] paramValues);

    void insertBatch(String sql, List<Object[]> params);

    int update(String sql, Object[] params);

    int update(String sql, Object[] params, int[] paramsType);

    int update(String sql);

    List<DbTask> batchUpdate(List<DbTask> list);

    List<DbTask> batchUpdateNoTransaction(List<DbTask> list);
}
