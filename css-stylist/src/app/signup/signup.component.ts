import { Component } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css'],
  imports: [FormsModule],
  standalone: true
})
export class SignupComponent {
  artist = {
    name: '',
    email: '',
    date: '',
    time: ''
  };

  constructor(private http: HttpClient) {}

  

  onSubmit() {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': 'https://evented.netlify.app'
    });

    this.http.post('https://calculated-bliss.onrender.com/user/submit', this.artist, { headers })
      .subscribe(response => {
        console.log('Artist registered:', response);
      });
  }
}