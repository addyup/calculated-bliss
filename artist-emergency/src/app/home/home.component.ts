import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { UserListComponent } from '../user-list/user-list.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, UserListComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.less'
})
export class HomeComponent {}
 

