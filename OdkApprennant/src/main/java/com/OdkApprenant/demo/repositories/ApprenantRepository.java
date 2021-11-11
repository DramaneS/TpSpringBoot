/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.repositories;

import com.OdkApprenant.demo.model.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author mohamedlamine.kone
 */

//toutes les methodes jpa repository sont accessibles a travers l'api rest repositories
@RepositoryRestResource
public interface ApprenantRepository extends JpaRepository <Apprenant, Integer> {
    
    
}
