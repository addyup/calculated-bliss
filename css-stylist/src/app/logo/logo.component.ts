import { Component } from '@angular/core';
import { ShowtimeScrapeComponentComponent } from '../showtime-scrape-component/showtime-scrape-component.component';

@Component({
  selector: 'app-logo',
  standalone: true,
  imports: [ShowtimeScrapeComponentComponent],
  templateUrl: './logo.component.html',
  styleUrl: './logo.component.less'
})
export class LogoComponent {

}
