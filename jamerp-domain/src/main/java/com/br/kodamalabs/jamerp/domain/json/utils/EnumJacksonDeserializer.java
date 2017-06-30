package com.br.kodamalabs.jamerp.domain.json.utils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.br.kodamalabs.jamerp.domain.DomainType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class EnumJacksonDeserializer extends JsonDeserializer<DomainType> {

    @Override
    @SuppressWarnings("rawtypes")
    public DomainType deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        ObjectCodec oc = jp.getCodec();
        JsonNode node = oc.readTree(jp);

        final String className = node.get(DomainType.CLASS_NAME).asText();
        Class enumType = getClass(className);
        if (enumType == null) {
            String[] splitted = className.split("\\.");
            final String name = splitted[splitted.length - 1];
            final String packageName = className.replace(name, "");
            enumType = getClass(packageName + "enumeration." + name);
        }

        if (enumType != null) {
            List<Object> listEnum = Arrays.asList(enumType.getEnumConstants());
            for (Object enumTypeObject : listEnum) {
                DomainType domainType = (DomainType) enumTypeObject;
                if (domainType.getCode() == node.get(DomainType.CODE).asInt())
                    return domainType;
            }
        }

        return null;
    }

    private Class<?> getClass(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            // no-op
        }

        return null;
    }

}
