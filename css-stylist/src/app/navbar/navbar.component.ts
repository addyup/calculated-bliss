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

  
}
