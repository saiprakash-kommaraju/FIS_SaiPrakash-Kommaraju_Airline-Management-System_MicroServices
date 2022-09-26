import { Component, OnInit } from '@angular/core';
import { FlightserviceService } from '../flightservice.service';

@Component({
  selector: 'app-delete-passenger-information',
  templateUrl: './delete-passenger-information.component.html',
  styleUrls: ['./delete-passenger-information.component.css']
})
export class DeletePassengerInformationComponent implements OnInit {

  constructor(private service:FlightserviceService) { }

  result:string="";
  profile_Id:number = 0;

  ngOnInit(): void {
  }

  deletePassenger(){
    this.service.deletePassenger(this.profile_Id);
    this.result = "Passenger Profile Deleted";
  }

}