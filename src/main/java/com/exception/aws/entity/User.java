package com.exception.aws.entity;

public class User {

    private String userName;
    private String userId;
    private double userSalary;

    public User(){

    }

    public User(String userName, String userId, double userSalary) {
        this.userName = userName;
        this.userId = userId;
        this.userSalary = userSalary;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserSalary(double userSalary) {
        this.userSalary = userSalary;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public double getUserSalary() {
        return userSalary;
    }
}
