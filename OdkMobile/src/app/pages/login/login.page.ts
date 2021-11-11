import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component} from '@angular/core';
import {  NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Api_url } from 'src/app/config.service';
import { ServicesService } from 'src/app/services.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage {

  //appel de l'url declarer dans config
  URL = Api_url.Source_url;

  login = {username: '', password:''}
  constructor(
    public router: Router, //redirection
    private http: HttpClient,
    private service: ServicesService
  ) {}

  ngOnInit() {
  }

  //fonction qui permet d'accepter toutes les requettes 
  async onLogin(form: NgForm){
    if (form.valid){
      const headers = new HttpHeaders();
      headers.append('Content-Type', 'application/json');
      headers.append('Accept', 'application/json');
      headers.append('Accept-Control-Allow-Origin', '*');//accepter toutes les requettes http
      headers.append('Accept-Control-Allow-Method', '*');
      headers.append('Accept-Control-Allow-Credentials', 'true');


      return this.http.post(this.URL + '/authentification/' + form.value["username"] + '/'  +  form.value["password"], {headers})
      .subscribe((response: any) => {
        console.log(response);
        console.log(response.login);  
          this.service.setLogin(response.login);
          this.service.setNom(response.nom_apprenant);
          this.service.setPrenom(response.prenom_apprenant);

          this.router.navigate(['/home'])
      })

    }
  }
}
