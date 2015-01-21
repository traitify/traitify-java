package com.traitify.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExperienceLevel {

    private Integer id;
    private String name;
    private String experience;
    private String education;
    private String job_training;
    private String examples;
    private String svp_range;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getJob_training() {
        return job_training;
    }

    public void setJob_training(String job_training) {
        this.job_training = job_training;
    }

    public String getExamples() {
        return examples;
    }

    public void setExamples(String examples) {
        this.examples = examples;
    }

    public String getSvp_range() {
        return svp_range;
    }

    public void setSvp_range(String svp_range) {
        this.svp_range = svp_range;
    }
}
