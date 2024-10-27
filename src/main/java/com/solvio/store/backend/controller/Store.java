package com.solvio.store.backend.controller;

public class Store {
    private String name;
    private String address;

    // Constructors, Getters, and Setters
    public Store() {}

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

