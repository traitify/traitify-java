package com.traitify.models;

public class AssessmentPersonalityTraitDichotomy {

    private PersonalityTrait left_personality_trait;
    private PersonalityTrait right_personality_trait;
    private Float score;


    public PersonalityTrait getLeft_personality_trait() {
        return left_personality_trait;
    }

    public void setLeft_personality_trait(PersonalityTrait left_personality_trait) {
        this.left_personality_trait = left_personality_trait;
    }

    public PersonalityTrait getRight_personality_trait() {
        return right_personality_trait;
    }

    public void setRight_personality_trait(PersonalityTrait right_personality_trait) {
        this.right_personality_trait = right_personality_trait;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
