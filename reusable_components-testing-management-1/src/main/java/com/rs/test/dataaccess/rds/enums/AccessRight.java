package com.rs.test.dataaccess.rds.enums;

public enum AccessRight {
    READ_WRITE("READ_WRITE"),
    READ("READ"),
    NO_ACCESS("NO_ACCESS");
    private String name;

    AccessRight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
