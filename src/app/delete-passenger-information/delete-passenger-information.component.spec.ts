import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletePassengerInformationComponent } from './delete-passenger-information.component';

describe('DeletePassengerInformationComponent', () => {
  let component: DeletePassengerInformationComponent;
  let fixture: ComponentFixture<DeletePassengerInformationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeletePassengerInformationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DeletePassengerInformationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
