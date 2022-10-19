package com.pluralsight.builder;

public enum HDD {
    DEFAULT (1024), UPGRADED(2048), MAX(4096);

    private int size;

    HDD (int size) {
        this.size = size;
    }
}
