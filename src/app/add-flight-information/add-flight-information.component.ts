import { Component, OnInit } from '@angular/core';
import { FlightserviceService } from '../flightservice.service';
import { post } from 'src/Post';

@Component({
  selector: 'app-add-flight-information',
  templateUrl: './add-flight-information.component.html',
  styleUrls: ['./add-flight-information.component.css']
})
export class AddFlightInformationComponent implements OnInit {

  constructor(private service:FlightserviceService) { }

  flight_Id:any;
  airline_Id:any;
  from_location:any;
  to_location:any;
  total_seats:any;

  ngOnInit(): void {
  }

  insertData(){

    let post : post = {
      "flight_Id":this.flight_Id,
      "airline_Id":this.airline_Id,
      "from_location":this.from_location,
      "to_location":this.to_location,
      "total_seats":this.total_seats
    }
    this.service.insertFlight(post);
  }

}