package com.traitify.models;

public enum AssessmentData {
    TYPES("types"),
    TRAITS("traits"),
    CAREER_MATCHES("career_matches"),
    BLEND("blend");

    private final String value;

    AssessmentData(String value) {
        this.value = value;
    }

    public String toString(){
        return value;
    }
}
