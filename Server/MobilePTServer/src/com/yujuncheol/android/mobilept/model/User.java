package com.yujuncheol.android.mobilept.model;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 4220461820168818967L;
    private String user_pk,user_id,user_pw,user_name;


    public User() {

    }

    public User(String user_pk,String user_id,String user_pw,String user_name) {
        this.user_pk = user_pk; this.user_id = user_id;
        this.user_pw = user_pw; this.user_name = user_name;
    }

    public void User(String user_pk,String user_id,String user_pw,String user_name) {
        this.user_pk = user_pk; this.user_id = user_id;
        this.user_pw = user_pw; this.user_name = user_name;
    }


    public String getUser_pk() {
        return user_pk;
    }

    public void setUser_pk(String user_pk) {
        this.user_pk = user_pk;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_pw() {
        return user_pw;
    }

    public void setUser_pw(String user_pw) {
        this.user_pw = user_pw;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }


}
