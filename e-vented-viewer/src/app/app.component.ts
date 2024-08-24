import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { DreamvilleEventsComponent } from './dreamville-events/dreamville-events.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, DreamvilleEventsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.less'
})
export class AppComponent {
  title = 'e-vented-viewer';
}
