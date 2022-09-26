import { Component, OnInit } from '@angular/core';
import { FlightserviceService } from '../flightservice.service';

@Component({
  selector: 'app-display-flight-information',
  templateUrl: './display-flight-information.component.html',
  styleUrls: ['./display-flight-information.component.css']
})
export class DisplayFlightInformationComponent implements OnInit {

  constructor(private service:FlightserviceService) { }
  flights: any
  ngOnInit(): void {
  }

  getAllFlights(){
    this.service.getAllFlights()
    .subscribe( response =>{
      this.flights=response;
      console.log(response);
    }
      );
  }

}