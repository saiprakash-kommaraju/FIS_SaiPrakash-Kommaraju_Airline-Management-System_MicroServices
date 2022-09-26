import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteFlightInformationComponent } from './delete-flight-information.component';

describe('DeleteFlightInformationComponent', () => {
  let component: DeleteFlightInformationComponent;
  let fixture: ComponentFixture<DeleteFlightInformationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeleteFlightInformationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DeleteFlightInformationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
