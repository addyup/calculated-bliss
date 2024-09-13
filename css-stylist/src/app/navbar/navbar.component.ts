import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';


@Component({
  selector: 'app-navbar',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.less'
})
export class NavbarComponent {
  songs: string[] = [];


  
}
