package com.traitify.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalityBlend {

    private PersonalityType personality_type_1;

    private PersonalityType personality_type_2;

    private String name;

    private String description;

    private String compliments;

    private String conflicts;

    public PersonalityType getPersonality_type_1() {
        return personality_type_1;
    }

    public void setPersonality_type_1(PersonalityType personality_type_1) {
        this.personality_type_1 = personality_type_1;
    }

    public PersonalityType getPersonality_type_2() {
        return personality_type_2;
    }

    public void setPersonality_type_2(PersonalityType personality_type_2) {
        this.personality_type_2 = personality_type_2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompliments() {
        return compliments;
    }

    public void setCompliments(String compliments) {
        this.compliments = compliments;
    }

    public String getConflicts() {
        return conflicts;
    }

    public void setConflicts(String conflicts) {
        this.conflicts = conflicts;
    }
}
