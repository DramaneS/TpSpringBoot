/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.repositories.ApprenantRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohamedlamine.kone
 */
@Service
public class ApprenantServiceImp implements ApprenantServices{

    //ordonner a spring d'injecter une implementation de l'interface ApprenantRepository dans l'objet apprenantRepository
    @Autowired
    ApprenantRepository apprenantRepository;
    
    @Override
    public Apprenant ajouterApprenant(Apprenant a) {
        
        return apprenantRepository.save(a);
    }

    @Override
    public Apprenant modifierApprenant(Apprenant a) {
        return apprenantRepository.save(a);
    }

    @Override
    public void supprimerApprenantById(Integer id_apprenant) {
        apprenantRepository.deleteById(id_apprenant);
    }

    @Override
    public Apprenant afficherApprenant(Integer id_apprenant) {
       return apprenantRepository.findById(id_apprenant).get();
    }

    @Override
    public List<Apprenant> afficherToutApprenant() {
        return apprenantRepository.findAll();
    }
    
}
