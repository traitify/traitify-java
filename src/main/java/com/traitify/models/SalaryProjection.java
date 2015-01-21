package com.traitify.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SalaryProjection {

    private String source;
    private Long total_employees;
    private Double hourly_rate_10_percentile;
    private Double hourly_rate_25_percentile;
    private Double hourly_rate_75_percentile;
    private Double hourly_rate_90_percentile;
    private Double hourly_rate_median;
    private Double hourly_rate_mean;
    private Double annual_salary_10_percentile;
    private Double annual_salary_25_percentile;
    private Double annual_salary_75_percentile;
    private Double annual_salary_90_percentile;
    private Double annual_salary_median;
    private Double annual_salary_mean;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getTotal_employees() {
        return total_employees;
    }

    public void setTotal_employees(Long total_employees) {
        this.total_employees = total_employees;
    }

    public Double getHourly_rate_10_percentile() {
        return hourly_rate_10_percentile;
    }

    public void setHourly_rate_10_percentile(Double hourly_rate_10_percentile) {
        this.hourly_rate_10_percentile = hourly_rate_10_percentile;
    }

    public Double getHourly_rate_25_percentile() {
        return hourly_rate_25_percentile;
    }

    public void setHourly_rate_25_percentile(Double hourly_rate_25_percentile) {
        this.hourly_rate_25_percentile = hourly_rate_25_percentile;
    }

    public Double getHourly_rate_75_percentile() {
        return hourly_rate_75_percentile;
    }

    public void setHourly_rate_75_percentile(Double hourly_rate_75_percentile) {
        this.hourly_rate_75_percentile = hourly_rate_75_percentile;
    }

    public Double getHourly_rate_90_percentile() {
        return hourly_rate_90_percentile;
    }

    public void setHourly_rate_90_percentile(Double hourly_rate_90_percentile) {
        this.hourly_rate_90_percentile = hourly_rate_90_percentile;
    }

    public Double getHourly_rate_median() {
        return hourly_rate_median;
    }

    public void setHourly_rate_median(Double hourly_rate_median) {
        this.hourly_rate_median = hourly_rate_median;
    }

    public Double getHourly_rate_mean() {
        return hourly_rate_mean;
    }

    public void setHourly_rate_mean(Double hourly_rate_mean) {
        this.hourly_rate_mean = hourly_rate_mean;
    }

    public Double getAnnual_salary_10_percentile() {
        return annual_salary_10_percentile;
    }

    public void setAnnual_salary_10_percentile(Double annual_salary_10_percentile) {
        this.annual_salary_10_percentile = annual_salary_10_percentile;
    }

    public Double getAnnual_salary_25_percentile() {
        return annual_salary_25_percentile;
    }

    public void setAnnual_salary_25_percentile(Double annual_salary_25_percentile) {
        this.annual_salary_25_percentile = annual_salary_25_percentile;
    }

    public Double getAnnual_salary_75_percentile() {
        return annual_salary_75_percentile;
    }

    public void setAnnual_salary_75_percentile(Double annual_salary_75_percentile) {
        this.annual_salary_75_percentile = annual_salary_75_percentile;
    }

    public Double getAnnual_salary_90_percentile() {
        return annual_salary_90_percentile;
    }

    public void setAnnual_salary_90_percentile(Double annual_salary_90_percentile) {
        this.annual_salary_90_percentile = annual_salary_90_percentile;
    }

    public Double getAnnual_salary_median() {
        return annual_salary_median;
    }

    public void setAnnual_salary_median(Double annual_salary_median) {
        this.annual_salary_median = annual_salary_median;
    }

    public Double getAnnual_salary_mean() {
        return annual_salary_mean;
    }

    public void setAnnual_salary_mean(Double annual_salary_mean) {
        this.annual_salary_mean = annual_salary_mean;
    }
}
