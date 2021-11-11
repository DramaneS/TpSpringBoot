/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.controllers;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.services.ApprenantServiceImp;
import com.OdkApprenant.demo.services.ApprenantServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mohamedlamine.kone
 */
@RestController
@RequestMapping("/api")
public class ApprenantController {

    @Autowired
    ApprenantServices implementApprenantService;

    @PostMapping(value = "/apprenant")
    public Apprenant save(@RequestBody Apprenant apprenant) {
        return implementApprenantService.ajouterApprenant(apprenant);
    }

    @GetMapping(path = "/getApprenant/{id}")
    public Apprenant getOne(@PathVariable("id") Integer id) {
        return implementApprenantService.afficherApprenant(id);
    }


    @GetMapping(path = "/apprenant", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Apprenant> liste() {
        return implementApprenantService.afficherToutApprenant();
    }

    @PutMapping(path = "/apprenant/{id}")
    public Apprenant update(@RequestBody Apprenant apprenant, @PathVariable Integer id_apprenant) {
        return implementApprenantService.modifierApprenant(apprenant);
    }

    @DeleteMapping(value = "/apprenant/{id}")
    public void delete(@PathVariable("id") Integer id_apprenant) {
        implementApprenantService.supprimerApprenantById(id_apprenant);

    }
}
