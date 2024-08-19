import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { User, UserService } from '../user.service';

@Component({
  selector: 'app-manager-form',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './manager-form.component.html',
  styleUrl: './manager-form.component.less'
})
export class ManagerFormComponent implements OnInit {
  userForm!: FormGroup;

  constructor(private fb: FormBuilder, private userService: UserService) { }

  ngOnInit(): void {
    this.userForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]]
    });
  }

  onSubmit(): void {
    if (this.userForm.valid) {
      const user: User = this.userForm.value;
      this.userService.addUser(user).subscribe(response => {
        console.log('User saved successfully', response);
        // Handle success (e.g., show a success message or navigate)
      }, error => {
        console.error('Error saving user', error);
        // Handle error (e.g., show an error message)
      });
    }
  }
  
}
