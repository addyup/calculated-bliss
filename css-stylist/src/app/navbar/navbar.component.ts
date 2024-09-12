import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { BillboardService } from '../services/billboard.service';

@Component({
  selector: 'app-navbar',
  standalone: true,
  imports: [CommonModule,],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.less'
})
export class NavbarComponent {
  songs: string[] = [];

  constructor(private billboardService: BillboardService) {}

  ngOnInit(): void {
    this.billboardService.getTopSongs().subscribe((data) => {
      this.songs = data.filter(song => 
        !song.includes('Imprint/Promotion Label:') && 
        !song.includes('Additional Awards')
      );
    });
  }
}
