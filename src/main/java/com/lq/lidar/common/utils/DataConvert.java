package com.lq.lidar.common.utils;

import com.google.common.collect.Maps;

import java.beans.Introspector;
import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.lq.lidar.common.utils.ClassUtils.getFieldValueByName;

/**
 * 数据格式转换类
 *
 * @author LQ
 */
public class DataConvert {
    /**
     * 将list数据转换为Label和value映射
     *
     * @param list 转换数据
     * @param <T>
     * @return
     */
    public static <T, R> List ListToMap(List<T> list, TypeFunction<R,String> lable) {
        String lambdaColumnName = TypeFunction.getLambdaColumnName(lable);
        List<HashMap<Object, Object>> maps = list.stream().map(data -> {
            HashMap<Object, Object> map = Maps.newHashMapWithExpectedSize(2);
            map.put("label", getFieldValueByName("ofcNm", data));
            map.put("value", getFieldValueByName("ofcId", data));
            return map;
        }).collect(Collectors.toList());
        return maps;
    }

    static <F, T> String getLambdaColumnName(TypeFunction<F, T> lambda) {
        try {
            Method[] methods = lambda.getClass().getMethods();
//            Method method = (Method) methods;
//            method.setAccessible(Boolean.TRUE);
//            SerializedLambda serializedLambda = (SerializedLambda) method.invoke(lambda);
//            String getter = serializedLambda.getImplMethodName();
//            String fieldName = Introspector.decapitalize(getter.replace("get", ""));
            String fieldName = "111";
            return fieldName;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
