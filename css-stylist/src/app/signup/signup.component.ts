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
      'Authorization': 'Bearer your-auth-token'  // Example of adding an Authorization header
    });

    this.http.post('http://localhost:8080/user/submit', this.artist, { headers })
      .subscribe(response => {
        console.log('Artist registered:', response);
      });
  }
}