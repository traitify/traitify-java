package com.traitify.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Career {

    private String id;
    private String title;
    private String description;
    private List<Major> majors;
    private ExperienceLevel experience_level;
    private SalaryProjection salary_projection;
    private EmploymentProjection employment_projection;
    private List<String> bright_outlooks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Major> getMajors() {
        return majors;
    }

    public void setMajors(List<Major> majors) {
        this.majors = majors;
    }

    public ExperienceLevel getExperience_level() {
        return experience_level;
    }

    public void setExperience_level(ExperienceLevel experience_level) {
        this.experience_level = experience_level;
    }

    public SalaryProjection getSalary_projection() {
        return salary_projection;
    }

    public void setSalary_projection(SalaryProjection salary_projection) {
        this.salary_projection = salary_projection;
    }

    public EmploymentProjection getEmployment_projection() {
        return employment_projection;
    }

    public void setEmployment_projection(EmploymentProjection employment_projection) {
        this.employment_projection = employment_projection;
    }

    public List<String> getBright_outlooks() {
        return bright_outlooks;
    }

    public void setBright_outlooks(List<String> bright_outlooks) {
        this.bright_outlooks = bright_outlooks;
    }

}
