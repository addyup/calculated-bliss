import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MandeerEventListComponent } from "../mandeer-event-list/mandeer-event-list.component";


@Component({
  selector: 'app-signup',
  templateUrl: './leflair.component.html',
  styleUrls: ['./leflair.component.css'],
  imports: [FormsModule, MandeerEventListComponent],
  standalone: true
})
export class SignupComponent {
  
}