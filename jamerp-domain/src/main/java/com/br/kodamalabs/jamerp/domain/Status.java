package com.br.kodamalabs.jamerp.domain;

import com.br.kodamalabs.jamerp.domain.json.utils.EnumJacksonDeserializer;
import com.br.kodamalabs.jamerp.domain.json.utils.EnumJacksonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = EnumJacksonSerializer.class)
@JsonDeserialize(using = EnumJacksonDeserializer.class)
public enum Status implements DomainType {

    ACTIVE(1, "ativo"), CANCELLED(0, "cancelado");

    private int code;

    private String description;

    private Status(int code, String description) {
        this.code = code;
        this.description = description;
    }
    
    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
    
    
}
