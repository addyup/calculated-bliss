import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CandidateCbeFormComponent } from './candidate-cbe-form.component';

describe('CandidateCbeFormComponent', () => {
  let component: CandidateCbeFormComponent;
  let fixture: ComponentFixture<CandidateCbeFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CandidateCbeFormComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CandidateCbeFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
