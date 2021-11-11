import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {map} from 'rxjs/operators';

@Component({
  selector: 'app-apprenant',
  templateUrl: './apprenant.page.html',
  styleUrls: ['./apprenant.page.scss'],
})
export class ApprenantPage implements OnInit {
  
  result: any;
  url = 'http://localhost:8080/api/apprenant';
  constructor(private http: HttpClient) { }
  
  ngOnInit() {
    this.result = this.http.get(this.url).pipe(
      map(result =>{
        console.log('RAW :: ', result)
        return result;
      })
    );
    
  }

}
