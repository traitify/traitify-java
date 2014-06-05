package com.traitify.models;

import com.traitify.net.ApiModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AssessmentPersonalityTypes extends ApiModel {

    private PersonalityBlend personality_blend;
    private List<AssessmentPersonalityType> personality_types;

    public PersonalityBlend getPersonality_blend() {
        return personality_blend;
    }

    public void setPersonality_blend(PersonalityBlend personality_blend) {
        this.personality_blend = personality_blend;
    }

    public List<AssessmentPersonalityType> getPersonality_types() {
        return personality_types;
    }

    public void setPersonality_types(List<AssessmentPersonalityType> personality_types) {
        this.personality_types = personality_types;
    }
}
