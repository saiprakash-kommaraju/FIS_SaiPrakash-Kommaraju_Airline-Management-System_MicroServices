import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayFlightInformationComponent } from './display-flight-information.component';

describe('DisplayFlightInformationComponent', () => {
  let component: DisplayFlightInformationComponent;
  let fixture: ComponentFixture<DisplayFlightInformationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplayFlightInformationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayFlightInformationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
