package xyz.apichiyu.project.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    public static <T>T toObject(Class<T> clazz,String jsonStr) {
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            return objectMapper.readValue(jsonStr,clazz);
        }catch(Exception e){
            return null;
        }
    }
    public static String toJson(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            return objectMapper.writeValueAsString(obj);
        }catch(Exception e){
            return null;
        }

    }
}
