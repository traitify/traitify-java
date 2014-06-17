package com.traitify.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeckBadge extends Badge {

    private String personality_type;

    private String description;

    public String getPersonality_type() {
        return personality_type;
    }

    public void setPersonality_type(String personality_type) {
        this.personality_type = personality_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
