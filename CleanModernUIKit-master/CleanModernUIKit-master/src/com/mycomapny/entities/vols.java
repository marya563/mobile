/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycomapny.entities;

import java.util.Date;

/**
 *
 * @author maria
 */
public class vols {
   private int id ; 
   private String destination_aller , destination_retour , voyage , cabine ,passagers ; 
   private Date date_depart , date_retour ; 

  
    public vols() {
    }
 
   
    public vols(int id, String destination_aller, String destination_retour, String voyage, String cabine, String passagers, Date date_depart, Date date_retour) {
        this.id = id;
        this.destination_aller = destination_aller;
        this.destination_retour = destination_retour;
        this.voyage = voyage;
        this.cabine = cabine;
        this.passagers = passagers;
        this.date_depart = date_depart;
        this.date_retour = date_retour;
    }

    public vols(String destination_aller, String destination_retour, String voyage, String cabine, String passagers, Date date_depart, Date date_retour) {
        this.destination_aller = destination_aller;
        this.destination_retour = destination_retour;
        this.voyage = voyage;
        this.cabine = cabine;
        this.passagers = passagers;
        this.date_depart = date_depart;
        this.date_retour = date_retour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestination_aller() {
        return destination_aller;
    }

    public void setDestination_aller(String destination_aller) {
        this.destination_aller = destination_aller;
    }

    public String getDestination_retour() {
        return destination_retour;
    }

    public void setDestination_retour(String destination_retour) {
        this.destination_retour = destination_retour;
    }

    public String getVoyage() {
        return voyage;
    }

    public void setVoyage(String voyage) {
        this.voyage = voyage;
    }

    public String getCabine() {
        return cabine;
    }

    public void setCabine(String cabine) {
        this.cabine = cabine;
    }

    public String getPassagers() {
        return passagers;
    }

    public void setPassagers(String passagers) {
        this.passagers = passagers;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public Date getDate_retour() {
        return date_retour;
    }

    public void setDate_retour(Date date_retour) {
        this.date_retour = date_retour;
    }
    
    
} 