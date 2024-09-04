import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css'],
  imports: [FormsModule],
  standalone: true
})
export class SignupComponent {
  // artist = {
  //   name: '',
  //   email: '',
  //   date: '',
  //   time: ''
  // };

  // constructor(private http: HttpClient) {}

  // onSubmit() {
  //   this.http.post('http://localhost:8080/api/artists', this.artist)
  //     .subscribe(response => {
  //       console.log('Artist registered:', response);
  //     });
  // }
}