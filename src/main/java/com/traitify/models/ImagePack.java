package com.traitify.models;

public enum ImagePack {
    FLAT("flat"),
    LINEAR("linear");

    private final String value;

    ImagePack(String value) {
        this.value = value;
    }

    public String toString(){
        return value;
    }
}
