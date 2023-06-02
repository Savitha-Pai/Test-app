package com.rs.test.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.IOException;
import java.util.List;

public class ObjectMapperUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static String mapObjectToJson(final Object object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);
    }

    public static <T> T mapJsonToObject(final String jsonObject, final Class<T> clazz) throws IOException {
        return objectMapper.readValue(jsonObject, clazz);
    }

    public static <T> List<T> mapStringToListObject(final String stringList, final Class<T> clazz) throws IOException {
        CollectionType javaType = objectMapper.getTypeFactory().constructCollectionType(List.class, clazz);
        return objectMapper.readValue(stringList, javaType);
    }

    private ObjectMapperUtil() {
    }
}
