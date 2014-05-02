package com.traitify.models;

import com.sun.jersey.api.client.GenericType;
import com.traitify.net.ApiModel;

import java.util.Date;
import java.util.List;

public class Deck extends ApiModel {

    public static List<Deck> list() {
        return baseResource("decks").get(new GenericType<List<Deck>>(){});
    }

    private String id;

    private String name;

    private String personality_group_id;

    private String personality_group_name;

    private Date created_at;

    private Integer slide_count;

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

    public String getPersonality_group_id() {
        return personality_group_id;
    }

    public void setPersonality_group_id(String personality_group_id) {
        this.personality_group_id = personality_group_id;
    }

    public String getPersonality_group_name() {
        return personality_group_name;
    }

    public void setPersonality_group_name(String personality_group_name) {
        this.personality_group_name = personality_group_name;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Integer getSlide_count() {
        return slide_count;
    }

    public void setSlide_count(Integer slide_count) {
        this.slide_count = slide_count;
    }
}