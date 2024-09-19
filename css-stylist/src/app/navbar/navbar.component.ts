import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { CandidateCbeFormComponent } from '../candidate-cbe-form/candidate-cbe-form.component';
import { Router } from '@angular/router';


@Component({
  selector: 'app-navbar',
  standalone: true,
  imports: [CommonModule, CandidateCbeFormComponent],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.less'
})
export class NavbarComponent {

  constructor(private router: Router) {}

  navigateToForm() {
    this.router.navigate(['/builder-form']);
  }


  
}
