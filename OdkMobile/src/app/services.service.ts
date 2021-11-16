import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Storage} from '@ionic/storage';
@Injectable({
  providedIn: 'root'
})
export class ServicesService {
  http: any;

  constructor(
    http: HttpClient,
    storage : Storage
  ) { }

  //recuperation des attributs saisis dans le champ

  public setNom(name){
    localStorage.setItem('nom', name);
  }

  public setPrenom(name){
    localStorage.setItem('prenom', name);
  }

  public setLogin(name){
    localStorage.setItem('login', name);
  }

  public getNom(){
    return localStorage.getItem('nom');
  }

  public getPrenom(){
    return localStorage.getItem('prenom');
  }

  public getLogin(){
   return localStorage.getItem('login');
  }
  //service pour se decoonecter
  public deconnexion(){
    localStorage.removeItem('login');
  }
}
