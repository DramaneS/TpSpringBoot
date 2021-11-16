import { Component, OnInit } from '@angular/core';
import { ServicesService } from 'src/app/services.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.page.html',
  styleUrls: ['./home.page.scss'],
})
export class HomePage implements OnInit {
username: String;
nom: String;
prenom: String;
  
myDate: any;
  constructor(
    private service: ServicesService
  ) {
   
   }

  ngOnInit() {
    this.myDate = new Date();
    this.username = this.service.getLogin();
    this.prenom = this.service.getPrenom();
    this.nom = this.service.getNom();
    console.log(this.service.getLogin());
    
  }


}
