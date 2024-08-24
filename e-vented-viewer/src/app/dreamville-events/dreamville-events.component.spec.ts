import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DreamvilleEventsComponent } from './dreamville-events.component';

describe('DreamvilleEventsComponent', () => {
  let component: DreamvilleEventsComponent;
  let fixture: ComponentFixture<DreamvilleEventsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DreamvilleEventsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DreamvilleEventsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
