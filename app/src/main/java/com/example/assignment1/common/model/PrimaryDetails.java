package com.example.assignment1.common.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrimaryDetails {
    @SerializedName("Place")
    @Expose
    private String place;
    @SerializedName("Salary")
    @Expose
    private String salary;
    @SerializedName("Job_Type")
    @Expose
    private String jobType;
    @SerializedName("Experience")
    @Expose
    private String experience;
    @SerializedName("Fees_Charged")
    @Expose
    private String feesCharged;
    @SerializedName("Qualification")
    @Expose
    private String qualification;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public PrimaryDetails withPlace(String place) {
        this.place = place;
        return this;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public PrimaryDetails withSalary(String salary) {
        this.salary = salary;
        return this;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public PrimaryDetails withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public PrimaryDetails withExperience(String experience) {
        this.experience = experience;
        return this;
    }

    public String getFeesCharged() {
        return feesCharged;
    }

    public void setFeesCharged(String feesCharged) {
        this.feesCharged = feesCharged;
    }

    public PrimaryDetails withFeesCharged(String feesCharged) {
        this.feesCharged = feesCharged;
        return this;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public PrimaryDetails withQualification(String qualification) {
        this.qualification = qualification;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PrimaryDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("place");
        sb.append('=');
        sb.append(((this.place == null)?"<null>":this.place));
        sb.append(',');
        sb.append("salary");
        sb.append('=');
        sb.append(((this.salary == null)?"<null>":this.salary));
        sb.append(',');
        sb.append("jobType");
        sb.append('=');
        sb.append(((this.jobType == null)?"<null>":this.jobType));
        sb.append(',');
        sb.append("experience");
        sb.append('=');
        sb.append(((this.experience == null)?"<null>":this.experience));
        sb.append(',');
        sb.append("feesCharged");
        sb.append('=');
        sb.append(((this.feesCharged == null)?"<null>":this.feesCharged));
        sb.append(',');
        sb.append("qualification");
        sb.append('=');
        sb.append(((this.qualification == null)?"<null>":this.qualification));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}
