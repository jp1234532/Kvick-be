package com.bezkoder.springjwt.models;

import com.bezkoder.springjwt.BusinessType;

import javax.persistence.*;
@Entity
@Table(name="business")
public class Business {

    @Id
    @SequenceGenerator(name="business_seq", sequenceName = "business_seq", allocationSize = 1)
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "business_seq")
    private  Long id;
    private  String title;
    private BusinessType typ;

    private String telefonNummer;

    private String postort;
    private String gatuadress;
    private String postnummer;

    public String getPostort() {
        return postort;
    }

    public void setPostort(String postort) {
        this.postort = postort;
    }

    public String getGatuadress() {
        return gatuadress;
    }

    public void setGatuadress(String gatuadress) {
        this.gatuadress = gatuadress;
    }

    public String getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(String postnummer) {
        this.postnummer = postnummer;
    }

    public String getTelefonNummer() {
        return telefonNummer;
    }

    public void setTelefonNummer(String telefonNummer) {
        this.telefonNummer = telefonNummer;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    private float latitude;
    private float longitude;

    public Business() {

    }

    public Business(long i, String task1) {
        id = i;
        title = task1;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTyp(BusinessType typ) {
        this.typ = typ;
    }

    public BusinessType getTyp() {
        return typ;
    }


}
