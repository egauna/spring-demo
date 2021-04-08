package com.fzybun.demo.domain;

public class User {
    private String fullname;
    private int age;
    private Boolean employed;
    private String gender;
    
    public User() {
    }

    public User(String fullname, int age, Boolean employed, String gender) {
        this.fullname = fullname;
        this.age = age;
        this.employed = employed;
        this.gender = gender;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Boolean getEmployed() {
        return employed;
    }
    public void setEmployed(Boolean employed) {
        this.employed = employed;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
