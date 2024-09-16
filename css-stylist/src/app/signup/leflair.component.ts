import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MandeerEventListComponent } from "../mandeer-event-list/mandeer-event-list.component";
import { TextGeneratorComponent } from "../text-generator/text-generator.component";


@Component({
  selector: 'app-signup',
  templateUrl: './leflair.component.html',
  styleUrls: ['./leflair.component.css'],
  imports: [FormsModule, MandeerEventListComponent, TextGeneratorComponent],
  standalone: true
})
export class SignupComponent {
  
}