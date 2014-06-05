package com.traitify.models;

import com.traitify.net.ApiModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AssessmentPersonalityTrait extends ApiModel {

    private PersonalityTrait personality_trait;
    private Float score;

    public PersonalityTrait getPersonality_trait() {
        return personality_trait;
    }

    public void setPersonality_trait(PersonalityTrait personality_trait) {
        this.personality_trait = personality_trait;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

}