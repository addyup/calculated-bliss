import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-candidate-form',
  templateUrl: './candidate-cbe-form.component.html',
  standalone: true,
  imports: [FormsModule, CommonModule],
  styleUrls: ['./candidate-cbe-form.component.less']
})
export class CandidateCbeFormComponent {
  candidate = {
    firstName: '',
    lastName: '',
    positionType: '',
    openForRelocation: false,
    currentLocation: '',
    visaStatus: '',
    email: ''
  };

  responseMessage = '';

  constructor(private http: HttpClient, private router: Router) {} 

  onSubmit() {
    this.http.post('https://web-scrapius.onrender.com/api/candidate/submit', this.candidate)
      .subscribe((response: any) => {
        this.responseMessage = response;
        this.router.navigate(['/form-submitted-success']); // Redirect to success page
      }, (_error) => {
        this.responseMessage = 'Error sending candidate details';
      });
  }
}
