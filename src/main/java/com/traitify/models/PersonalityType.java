package com.traitify.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalityType {

    private String id;
    private String name;
    private String description;
    private String compatible_personality_type_id;
    private Badge badge;
    private String keywords;
    private Set<Detail> details;
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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Set<Detail> getDetails() {
        return details;
    }

    public void setDetails(Set<Detail> details) {
        this.details = details;
    }
}
