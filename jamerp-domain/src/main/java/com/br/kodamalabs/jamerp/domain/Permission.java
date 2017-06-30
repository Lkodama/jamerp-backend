package com.br.kodamalabs.jamerp.domain;

public enum Permission implements DomainType{

    ADMIN(1, "admin"), COMMON(2, "common");

    private final int code;

    private final String description;

    private Permission(int code, String description) {
        this.code = code;
        this.description = description;

    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public static Permission getByDescription(String description) {
        for (Permission permission : Permission.values()) {
            if (permission.getDescription().equals(description)) {
                return permission;
            }
        }

        return null;
    }
}
