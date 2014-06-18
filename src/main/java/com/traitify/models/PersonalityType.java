package com.traitify.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalityType {

    private String id;
    private String name;
    private String description;
    private String compatible_personality_type_id;
    private Badge badge;

    private List<FamousPerson> famous_people;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Badge getBadge() {
        return badge;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    public String getCompatible_personality_type_id() {
        return compatible_personality_type_id;
    }

    public void setCompatible_personality_type_id(String compatible_personality_type_id) {
        this.compatible_personality_type_id = compatible_personality_type_id;
    }

    public List<FamousPerson> getFamous_people() {
        return famous_people;
    }

    public void setFamous_people(List<FamousPerson> famous_people) {
        this.famous_people = famous_people;
    }

}
