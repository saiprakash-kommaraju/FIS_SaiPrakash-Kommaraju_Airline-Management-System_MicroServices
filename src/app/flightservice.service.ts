import { Injectable } from '@angular/core';

import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FlightserviceService {

  constructor(private httpClient:HttpClient) { }


getAllFlights(){
  return this.httpClient.get("http://localhost:8022/flights/getAllFlights");
}

insertFlight(post:any){
  this.httpClient.post("http://localhost:8022/flights/addFlight", post)
  .subscribe(
    response =>{
      console.log(response);
    },
    error => {
      console.log(error);
    }
  );

}

deleteFlight(id:number){
  this.httpClient.delete("http://localhost:8022/flights/deleteFlight/"+id)
  .subscribe(
    response => {
      console.log(response);
    },
    error => {
      console.log(error);
    }
  )
}
deletePassenger(id:number){
  this.httpClient.delete("http://localhost:8022/flights/deletePassenger/"+id)
  .subscribe(
    response => {
      console.log(response);
    },
    error => {
      console.log(error);
    }
  )
}

}