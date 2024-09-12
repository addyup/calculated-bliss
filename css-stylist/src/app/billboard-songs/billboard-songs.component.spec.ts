import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BillboardSongsComponent } from './billboard-songs.component';

describe('BillboardSongsComponent', () => {
  let component: BillboardSongsComponent;
  let fixture: ComponentFixture<BillboardSongsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BillboardSongsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BillboardSongsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
