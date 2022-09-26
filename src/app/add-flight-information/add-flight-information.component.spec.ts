import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddFlightInformationComponent } from './add-flight-information.component';

describe('AddFlightInformationComponent', () => {
  let component: AddFlightInformationComponent;
  let fixture: ComponentFixture<AddFlightInformationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddFlightInformationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddFlightInformationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
