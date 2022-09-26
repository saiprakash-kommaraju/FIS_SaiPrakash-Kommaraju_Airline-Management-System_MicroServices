import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFlightInformationComponent } from './add-flight-information/add-flight-information.component';
import { DeleteFlightInformationComponent } from './delete-flight-information/delete-flight-information.component';
import { DeletePassengerInformationComponent } from './delete-passenger-information/delete-passenger-information.component';
import { DisplayFlightInformationComponent } from './display-flight-information/display-flight-information.component';


const routes: Routes = [
  {path:'add-flight-information', component: AddFlightInformationComponent},
  {path:'delete-flight-information', component: DeleteFlightInformationComponent},
  {path:'delete-passenger-information', component: DeletePassengerInformationComponent},
  {path:'display-flight-information', component: DisplayFlightInformationComponent},
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }