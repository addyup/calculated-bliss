import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowtimeScrapeComponentComponent } from './showtime-scrape-component.component';

describe('ShowtimeScrapeComponentComponent', () => {
  let component: ShowtimeScrapeComponentComponent;
  let fixture: ComponentFixture<ShowtimeScrapeComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ShowtimeScrapeComponentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowtimeScrapeComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
