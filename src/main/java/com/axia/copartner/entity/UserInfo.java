package com.axia.copartner.entity;


import org.springframework.stereotype.Repository;

@Repository
public class UserInfo  {

    private String userID ;

    private String telephone ;

    private String username ;

    private String integralLast ;

    private String token ;

    private String lastLoginTime ;

    private String auth ;



    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIntegralLast() {
        return integralLast;
    }

    public void setIntegralLast(String integralLast) {
        this.integralLast = integralLast;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
