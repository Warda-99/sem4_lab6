package com.example.demo;

public enum Importance {
    OPTIONAL ("OPTIONAL"),
    STANDARD ("STANDARD"),
    URGENT ("URGENT");

    private final String name;

    Importance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
