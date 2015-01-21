package com.traitify.models;

import com.sun.jersey.api.client.GenericType;
import com.traitify.net.ApiModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Slide extends ApiModel {

    public static List<Slide> list(String assessment_id){
        return baseResource("assessments/" + assessment_id + "/slides").get(new GenericType<List<Slide>>(){});
    }

    public static Slide get(String assessment_id, String slide_id){
        return baseResource("assessments/" + assessment_id + "/slides/" + slide_id).get(Slide.class);
    }

    public static Slide update(String assessment_id, Slide slide){
        return baseResource("assessments/" + assessment_id + "/slides/" + slide.getId()).put(Slide.class, slide);
    }

    public static List<Slide> bulkUpdate(String assessment_id, List<Slide> slides) {
        return baseResource("assessments/" + assessment_id + "/slides").put(new GenericType<List<Slide>>(){}, slides);
    }

    private String id;
    private int position;
    private String caption;
    private String image_desktop;
    private String image_desktop_retina;
    @Deprecated
    private String image_phone_landscape;
    @Deprecated
    private String image_phone_portrait;
    private Boolean response;
    private Integer time_taken;
    private Date completed_at;
    private Date created_at;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getImage_desktop() {
        return image_desktop;
    }

    public void setImage_desktop(String image_desktop) {
        this.image_desktop = image_desktop;
    }

    public String getImage_desktop_retina() {
        return image_desktop_retina;
    }

    public void setImage_desktop_retina(String image_desktop_retina) {
        this.image_desktop_retina = image_desktop_retina;
    }

    @Deprecated
    public String getImage_phone_landscape() {
        return image_phone_landscape;
    }

    @Deprecated
    public void setImage_phone_landscape(String image_phone_landscape) {
        this.image_phone_landscape = image_phone_landscape;
    }

    @Deprecated
    public String getImage_phone_portrait() {
        return image_phone_portrait;
    }

    @Deprecated
    public void setImage_phone_portrait(String image_phone_portrait) {
        this.image_phone_portrait = image_phone_portrait;
    }

    public Boolean getResponse() {
        return response;
    }

    public void setResponse(Boolean response) {
        this.response = response;
    }

    public Integer getTime_taken() {
        return time_taken;
    }

    public void setTime_taken(Integer time_taken) {
        this.time_taken = time_taken;
    }

    public Date getCompleted_at() {
        return completed_at;
    }

    public void setCompleted_at(Date completed_at) {
        this.completed_at = completed_at;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

}
