package com.traitify.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmploymentProjection {

    private String source;
    private Long annual_salary_median_2012;
    private Long total_employees_2012;
    private Long total_employees_2022;
    private Long new_openings_2022;
    private Long new_openings_and_replacement_2022;
    private Double percent_growth_2022;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getAnnual_salary_median_2012() {
        return annual_salary_median_2012;
    }

    public void setAnnual_salary_median_2012(Long annual_salary_median_2012) {
        this.annual_salary_median_2012 = annual_salary_median_2012;
    }

    public Long getTotal_employees_2012() {
        return total_employees_2012;
    }

    public void setTotal_employees_2012(Long total_employees_2012) {
        this.total_employees_2012 = total_employees_2012;
    }

    public Long getTotal_employees_2022() {
        return total_employees_2022;
    }

    public void setTotal_employees_2022(Long total_employees_2022) {
        this.total_employees_2022 = total_employees_2022;
    }

    public Long getNew_openings_2022() {
        return new_openings_2022;
    }

    public void setNew_openings_2022(Long new_openings_2022) {
        this.new_openings_2022 = new_openings_2022;
    }

    public Long getNew_openings_and_replacement_2022() {
        return new_openings_and_replacement_2022;
    }

    public void setNew_openings_and_replacement_2022(Long new_openings_and_replacement_2022) {
        this.new_openings_and_replacement_2022 = new_openings_and_replacement_2022;
    }

    public Double getPercent_growth_2022() {
        return percent_growth_2022;
    }

    public void setPercent_growth_2022(Double percent_growth_2022) {
        this.percent_growth_2022 = percent_growth_2022;
    }
}
