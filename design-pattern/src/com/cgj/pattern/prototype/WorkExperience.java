package com.cgj.pattern.prototype;

public class WorkExperience implements Cloneable {

    private String time;
    private String company;

    public WorkExperience(String time, String company) {
        super();
        this.time = time;
        this.company = company;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "WorkExperience [time=" + time + ", company=" + company + "]";
    }

    // 重写clone方法
    public WorkExperience clone() throws CloneNotSupportedException {
        return (WorkExperience) super.clone();
    }
}
