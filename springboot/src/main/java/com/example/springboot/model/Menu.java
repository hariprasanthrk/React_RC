package com.example.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Menu {
    @Id
    private int id;
    private String gujrati;
    private String dosa;
    private String chola;
    private String idly;
    private String masaladosa;
    private String paneer;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGujrati() {
        return gujrati;
    }

    public void setGujrati(String gujrati) {
        this.gujrati = gujrati;
    }

    public String getDosa() {
        return dosa;
    }

    public void setDosa(String dosa) {
        this.dosa = dosa;
    }

    public String getChola() {
        return chola;
    }

    public void setChola(String chola) {
        this.chola = chola;
    }

    public String getIdly() {
        return idly;
    }

    public void setIdly(String idly) {
        this.idly = idly;
    }

    public String getMasaladosa() {
        return masaladosa;
    }

    public void setMasaladosa(String masaladosa) {
        this.masaladosa = masaladosa;
    }

    public String getPaneer() {
        return paneer;
    }

    public void setPaneer(String paneer) {
        this.paneer = paneer;
    }

    public Menu() {
    }

    public Menu(int id, String gujrati, String dosa, String chola, String idly, String masaladosa, String paneer) {
        this.id = id;
        this.gujrati = gujrati;
        this.dosa = dosa;
        this.chola = chola;
        this.idly = idly;
        this.masaladosa = masaladosa;
        this.paneer = paneer;
    }
}
