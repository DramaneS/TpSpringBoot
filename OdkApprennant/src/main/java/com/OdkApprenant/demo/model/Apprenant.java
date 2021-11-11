/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;

/**
 *
 * @author mohamedlamine.kone
 */

@Entity 
public class Apprenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_apprenant;
    private String nom_apprenant;
    private String prenom_apprenant;
    private String email_apprenant;
    private String login_apprenant;
    private String password_apprenant;
    private int age_apprenant;
    private String genre_apprenant;
    private ApprenantStatus status_apprenant;
    @Temporal(TemporalType.DATE)
    private Date date_creation;
    @Temporal(TemporalType.DATE)
    private Date date_modification;

    //constructeur vide
    public Apprenant() {
    }
    
    //constructeur avec parametre sans id

    public Apprenant(String nom_apprenant, String prenom_apprenant, String email_apprenant, String login_apprenant, String password_apprenant, int age_apprenant, String genre_apprenant, ApprenantStatus status_apprenant, Date date_creation, Date date_modification) {
        this.nom_apprenant = nom_apprenant;
        this.prenom_apprenant = prenom_apprenant;
        this.email_apprenant = email_apprenant;
        this.login_apprenant = login_apprenant;
        this.password_apprenant = password_apprenant;
        this.age_apprenant = age_apprenant;
        this.genre_apprenant = genre_apprenant;
        this.status_apprenant = status_apprenant;
        this.date_creation = date_creation;
        this.date_modification = date_modification;
    }

    //constructeur avec id
    
    public Apprenant(int id_apprenant, String nom_apprenant, String prenom_apprenant, String email_apprenant, String login_apprenant, String password_apprenant, int age_apprenant, String genre_apprenant, ApprenantStatus status_apprenant, Date date_creation, Date date_modification) {
        this.id_apprenant = id_apprenant;
        this.nom_apprenant = nom_apprenant;
        this.prenom_apprenant = prenom_apprenant;
        this.email_apprenant = email_apprenant;
        this.login_apprenant = login_apprenant;
        this.password_apprenant = password_apprenant;
        this.age_apprenant = age_apprenant;
        this.genre_apprenant = genre_apprenant;
        this.status_apprenant = status_apprenant;
        this.date_creation = date_creation;
        this.date_modification = date_modification;
    }

    public int getId_apprenant() {
        return id_apprenant;
    }

    public void setId_apprenant(int id_apprenant) {
        this.id_apprenant = id_apprenant;
    }

    public String getNom_apprenant() {
        return nom_apprenant;
    }

    public void setNom_apprenant(String nom_apprenant) {
        this.nom_apprenant = nom_apprenant;
    }

    public String getPrenom_apprenant() {
        return prenom_apprenant;
    }

    public void setPrenom_apprenant(String prenom_apprenant) {
        this.prenom_apprenant = prenom_apprenant;
    }

    public String getEmail_apprenant() {
        return email_apprenant;
    }

    public void setEmail_apprenant(String email_apprenant) {
        this.email_apprenant = email_apprenant;
    }

    public String getLogin_apprenant() {
        return login_apprenant;
    }

    public void setLogin_apprenant(String login_apprenant) {
        this.login_apprenant = login_apprenant;
    }

    public String getPassword_apprenant() {
        return password_apprenant;
    }

    public void setPassword_apprenant(String password_apprenant) {
        this.password_apprenant = password_apprenant;
    }

    public int getAge_apprenant() {
        return age_apprenant;
    }

    public void setAge_apprenant(int age_apprenant) {
        this.age_apprenant = age_apprenant;
    }

    public String getGenre_apprenant() {
        return genre_apprenant;
    }

    public void setGenre_apprenant(String genre_apprenant) {
        this.genre_apprenant = genre_apprenant;
    }

    public ApprenantStatus getStatus_apprenant() {
        return status_apprenant;
    }

    public void setStatus_apprenant(ApprenantStatus status_apprenant) {
        this.status_apprenant = status_apprenant;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public Date getDate_modification() {
        return date_modification;
    }

    public void setDate_modification(Date date_modification) {
        this.date_modification = date_modification;
    }
    
    
}
