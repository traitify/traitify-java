package com.traitify.models;

public class AssessmentPersonalityType {

    private PersonalityType personality_type;
    private Float score;

    public PersonalityType getPersonality_type() {
        return personality_type;
    }

    public void setPersonality_type(PersonalityType personality_type) {
        this.personality_type = personality_type;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
