package com.traitify.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.jersey.api.client.GenericType;
import com.traitify.net.ApiModel;

import java.util.Date;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Assessment extends ApiModel {

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
        return baseResource("assessments/" + assessment_id + "/personality_types/" + personality_type_id + "/personality_traits").get(new GenericType<List<AssessmentPersonalityTrait>>() {});
    }

    public static List<AssessmentPersonalityTraitDichotomy> personalityTraits(String assessment_id){
        return baseResource("assessments/" + assessment_id + "/personality_traits").get(new GenericType<List<AssessmentPersonalityTraitDichotomy>>(){});
    }

    public static List<AssessmentPersonalityTrait> rawPersonalityTraits(String assessment_id){
        return baseResource("assessments/" + assessment_id + "/personality_traits/raw").get(new GenericType<List<AssessmentPersonalityTrait>>(){});
    }

    public static List<ScoredCareer> careerMatches(String assessment_id){
        return careerMatches(assessment_id, null, null);
    }

    public static List<ScoredCareer> careerMatches(String assessment_id, Integer number_of_matches){
        return careerMatches(assessment_id, number_of_matches, null);
    }

    public static List<ScoredCareer> careerMatches(String assessment_id,  List<Integer> experience_levels){
        return careerMatches(assessment_id, null, experience_levels);
    }

    public static List<ScoredCareer> careerMatches(String assessment_id, Integer number_of_matches, List<Integer> experience_levels){
        StringBuilder requestURL = new StringBuilder();

        requestURL.append("assessments/").append(assessment_id).append("/matches/careers?x=1");

        appendCareerMatchOptions(number_of_matches, experience_levels, requestURL);

        return baseResource(requestURL.toString()).get(new GenericType<List<ScoredCareer>>(){});
    }

    public static Assessment get(String assessment_id) {
        return results(assessment_id, null);
    }

    public static Assessment results(String assessment_id, List<AssessmentData> data_to_return){
        return results(assessment_id, data_to_return, null);
    }

    public static Assessment results(String assessment_id, List<AssessmentData> data_to_return, ImagePack image_pack){
        return results(assessment_id, data_to_return, image_pack, null);
    }

    public static Assessment results(String assessment_id, List<AssessmentData> data_to_return, ImagePack image_pack, Integer number_of_matches){
        return results(assessment_id, data_to_return, image_pack, number_of_matches, null);
    }

    public static Assessment results(String assessment_id, List<AssessmentData> data_to_return, ImagePack image_pack, Integer number_of_matches, List<Integer> experience_levels){
        StringBuilder requestURL = new StringBuilder();

        requestURL.append("assessments/").append(assessment_id).append("?x=1");

        if(data_to_return != null){
            requestURL.append("&data=").append(listToString(data_to_return));
        }
        if(image_pack != null){
            requestURL.append("&image_pack=").append(image_pack);
        }
        appendCareerMatchOptions(number_of_matches, experience_levels, requestURL);

        return baseResource(requestURL.toString()).get(Assessment.class);
    }

    private static void appendCareerMatchOptions(Integer number_of_matches, List<Integer> experience_levels, StringBuilder requestURL) {
        if(number_of_matches != null){
            requestURL.append("&number_of_matches=").append(number_of_matches);
        }
        if(experience_levels != null){
            requestURL.append("&experience_levels=").append(listToString(experience_levels));
        }
    }

    private static String listToString(List<?> list) {
        StringBuilder sb = new StringBuilder();
        for(int x = 0; x < list.size(); x++){
            sb.append(list.get(x));
            if(x < list.size()){
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private String id;
    private String deck_id;
    private String user_id;
    private Date created_at;
    private Date completed_at;
    private PersonalityBlend personality_blend;
    private List<AssessmentPersonalityType> personality_types;
    private List<AssessmentPersonalityTrait> personality_traits;
    private List<ScoredCareer> career_matches;
    private List<Slide> slides;

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
