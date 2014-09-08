package com.traitify.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalityBlend {

    private PersonalityType personality_type_1;

    private PersonalityType personality_type_2;

    private PersonalityGroup personality_group;

    private String name;

    private String description;

    private Set<Detail> details;

    private List<Environment> environments;

    private List<FamousPerson> famous_people;

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

    public PersonalityGroup getPersonality_group() {
        return personality_group;
    }

    public void setPersonality_group(PersonalityGroup personality_group) {
        this.personality_group = personality_group;
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

    public Set<Detail> getDetails() {
        return details;
    }

    public void setDetails(Set<Detail> details) {
        this.details = details;
    }

    public List<Environment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(List<Environment> environments) {
        this.environments = environments;
    }

    public List<FamousPerson> getFamous_people() {
        return famous_people;
    }

    public void setFamous_people(List<FamousPerson> famous_people) {
        this.famous_people = famous_people;
    }
}
