package com.example.demo.models.entities;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_address",schema = "address")
public class Address {

    @Id
    @NotNull
    private String zip_cd;

    @NotNull
    private String prefecture_name;

    @NotNull
    private String city_name;

    @NotNull
    private String street_name;

    public String getZip_cd() {
        return zip_cd;
    }

    public void setZip_cd(String zip_cd) {
        this.zip_cd = zip_cd;
    }

    public String getPrefecture_name() {
        return prefecture_name;
    }

    public void setPrefecture_name(String prefecture_name) {
        this.prefecture_name = prefecture_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }


}
