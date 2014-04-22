package com.traitify.models;

import com.sun.jersey.api.client.GenericType;
import com.traitify.net.ApiModel;

import java.util.Date;
import java.util.List;

public class Assessment extends ApiModel {

    public static Assessment get(String assessment_id) {
        return baseResource("assessments/" + assessment_id).get(Assessment.class);
    }

    public static Assessment create(String deck_id, String user_id) {
        Assessment assessment = new Assessment();
        assessment.setDeck_id(deck_id);
        assessment.setUser_id(user_id);
        return Assessment.create(assessment);
    }

    public static Assessment create(String deck_id) {
        Assessment assessment = new Assessment();
        assessment.setDeck_id(deck_id);
        return Assessment.create(assessment);
    }

    public static Assessment create(Assessment assessment) {
        return baseResource("assessments").post(Assessment.class, assessment);
    }

    public static Assessment update(Assessment assessment) {
        return baseResource("assessments/" + assessment.getId()).put(Assessment.class, assessment);
    }

    public static AssessmentPersonalityTypes personalityTypes(String assessment_id){
        return baseResource("assessments/" + assessment_id + "/personality_types").get(AssessmentPersonalityTypes.class);
    }

    public static List<AssessmentPersonalityTrait> personalityTraits(String assessment_id, String personality_type_id){
        return baseResource("assessments/" + assessment_id + "/personality_types/" + personality_type_id + "/personality_traits").get(new GenericType<List<AssessmentPersonalityTrait>>(){});
    }

    private String id;
    private String deck_id;
    private String user_id;
    private Date created_at;
    private Date completed_at;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeck_id() {
        return deck_id;
    }

    public void setDeck_id(String deck_id) {
        this.deck_id = deck_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getCompleted_at() {
        return completed_at;
    }

    public void setCompleted_at(Date completed_at) {
        this.completed_at = completed_at;
    }

}
