import { Component, OnInit } from '@angular/core';
import { FlightserviceService } from '../flightservice.service';

@Component({
  selector: 'app-delete-flight-information',
  templateUrl: './delete-flight-information.component.html',
  styleUrls: ['./delete-flight-information.component.css']
})
export class DeleteFlightInformationComponent implements OnInit {

  constructor(private service:FlightserviceService) { }

  result:string="";
  flight_Id:number = 0;
  

  ngOnInit(): void {
  }

  deleteFlight(){
    this.service.deleteFlight(this.flight_Id);
    this.result = "Flight Data Deleted";
  }

}