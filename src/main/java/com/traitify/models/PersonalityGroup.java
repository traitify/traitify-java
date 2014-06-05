package com.traitify.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalityGroup {

    private String id;
    private String name;
    private Boolean active;
    private Set<Deck> decks;
    private Set<PersonalityType> personality_types;
    private Date created_at = new Date();

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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Set<Deck> getDecks() {
        return decks;
    }

    public void setDecks(Set<Deck> decks) {
        this.decks = decks;
    }

    public Set<PersonalityType> getPersonality_types() {
        return personality_types;
    }

    public void setPersonality_types(Set<PersonalityType> personality_types) {
        this.personality_types = personality_types;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}