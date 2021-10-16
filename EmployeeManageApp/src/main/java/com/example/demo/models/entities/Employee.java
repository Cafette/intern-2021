package com.example.demo.models.entities;

import com.sun.istack.NotNull;


import javax.persistence.*;


@Entity
@Table(name = "t_employee", schema = "address")
public class Employee {

    @Id
    @NotNull
    private Integer user_id;

    @NotNull
    private String user_name;

    @NotNull
    private String phone_num;

    @NotNull
    private String zip_cd;

    @NotNull
    private String user_adr;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getZip_cd() {
        return zip_cd;
    }

    public void setZip_cd(String zip_cd) {
        this.zip_cd = zip_cd;
    }

    public String getUser_adr() {
        return user_adr;
    }

    public void setUser_adr(String user_adr) {
        this.user_adr = user_adr;
    }
}


