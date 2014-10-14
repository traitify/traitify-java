package com.traitify.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalityTrait {

    private String name;
    private String definition;
    private String description;
    private PersonalityType personality_type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PersonalityType getPersonality_type() {
        return personality_type;
    }

    public void setPersonality_type(PersonalityType personality_type) {
        this.personality_type = personality_type;
    }
}
