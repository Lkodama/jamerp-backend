package com.br.kodamalabs.domain;

public enum Status {

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
