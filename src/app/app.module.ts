import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddFlightInformationComponent } from './add-flight-information/add-flight-information.component';
import { DeleteFlightInformationComponent } from './delete-flight-information/delete-flight-information.component';
import { DeletePassengerInformationComponent } from './delete-passenger-information/delete-passenger-information.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { DisplayFlightInformationComponent } from './display-flight-information/display-flight-information.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  declarations: [
    AppComponent,
    AddFlightInformationComponent,
    DeleteFlightInformationComponent,
    DeletePassengerInformationComponent,
    DisplayFlightInformationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }