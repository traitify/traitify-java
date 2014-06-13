package com.traitify.models;

import com.sun.jersey.api.client.GenericType;
import com.traitify.net.ApiModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Deck extends ApiModel {

    public static List<Deck> list() {
        return baseResource("decks").get(new GenericType<List<Deck>>(){});
    }

    private String id;

    private String name;

    private String description;

    private String personality_group;

    private Integer slide_count;

    private List<DeckBadge> badges;

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

    public String getPersonality_group() {
        return personality_group;
    }

    public void setPersonality_group(String personality_group) {
        this.personality_group = personality_group;
    }

    public Integer getSlide_count() {
        return slide_count;
    }

    public void setSlide_count(Integer slide_count) {
        this.slide_count = slide_count;
    }

    public List<DeckBadge> getBadges() {
        return badges;
    }

    public void setBadges(List<DeckBadge> badges) {
        this.badges = badges;
    }
}
