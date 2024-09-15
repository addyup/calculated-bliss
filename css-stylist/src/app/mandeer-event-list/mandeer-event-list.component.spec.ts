import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MandeerEventListComponent } from './mandeer-event-list.component';

describe('MandeerEventListComponent', () => {
  let component: MandeerEventListComponent;
  let fixture: ComponentFixture<MandeerEventListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MandeerEventListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MandeerEventListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
