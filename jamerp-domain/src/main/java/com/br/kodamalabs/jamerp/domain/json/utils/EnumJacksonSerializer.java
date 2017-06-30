package com.br.kodamalabs.jamerp.domain.json.utils;

import java.io.IOException;

import com.br.kodamalabs.jamerp.domain.DomainType;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class EnumJacksonSerializer extends JsonSerializer<DomainType> {

    @Override
    public void serialize(DomainType value, JsonGenerator jgen, SerializerProvider serializers)
            throws IOException, JsonProcessingException {
        jgen.writeStartObject();
        jgen.writeFieldName(DomainType.CLASS_NAME);
        jgen.writeString(value.getClass().getName());
        jgen.writeFieldName(DomainType.CODE);
        jgen.writeNumber(value.getCode());
        jgen.writeFieldName(DomainType.DESCRIPTION);
        jgen.writeString(value.getDescription());
        jgen.writeEndObject();

    }

}
