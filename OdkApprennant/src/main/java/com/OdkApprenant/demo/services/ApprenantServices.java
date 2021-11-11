/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohamedlamine.kone
 */
@Service
public interface ApprenantServices {
    
   public Apprenant ajouterApprenant(Apprenant a);
   public Apprenant modifierApprenant(Apprenant a);
   public void supprimerApprenantById(Integer id_apprenant);
   public Apprenant afficherApprenant(Integer id_apprenant);
   public List<Apprenant> afficherToutApprenant();
    
}
