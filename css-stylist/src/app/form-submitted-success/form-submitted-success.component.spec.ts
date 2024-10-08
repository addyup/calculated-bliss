import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormSubmittedSuccessComponent } from './form-submitted-success.component';

describe('FormSubmittedSuccessComponent', () => {
  let component: FormSubmittedSuccessComponent;
  let fixture: ComponentFixture<FormSubmittedSuccessComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormSubmittedSuccessComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormSubmittedSuccessComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
