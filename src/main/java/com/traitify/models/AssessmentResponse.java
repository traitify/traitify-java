package com.traitify.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssessmentResponse extends Assessment {

    private PersonalityBlend personality_blend;
    private List<AssessmentPersonalityType> personality_types;
    private List<AssessmentPersonalityTrait> personality_traits;
    private List<ScoredCareer> career_matches;
    private List<Slide> slides;

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

    public List<AssessmentPersonalityTrait> getPersonality_traits() {
        return personality_traits;
    }

    public void setPersonality_traits(List<AssessmentPersonalityTrait> personality_traits) {
        this.personality_traits = personality_traits;
    }

    public List<ScoredCareer> getCareer_matches() {
        return career_matches;
    }

    public void setCareer_matches(List<ScoredCareer> career_matches) {
        this.career_matches = career_matches;
    }

    public List<Slide> getSlides() {
        return slides;
    }

    public void setSlides(List<Slide> slides) {
        this.slides = slides;
    }
}
