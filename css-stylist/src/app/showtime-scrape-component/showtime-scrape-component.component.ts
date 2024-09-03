import { Component, OnInit } from '@angular/core';
import { MyServiceService } from '../my-service.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-showtime-scrape-component',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './showtime-scrape-component.component.html',
  styleUrl: './showtime-scrape-component.component.less'
})
export class ShowtimeScrapeComponentComponent implements OnInit {
  myString: string | undefined;

  constructor(private myService: MyServiceService) {}

  splitStrings: string[] = [];

  ngOnInit(): void {
    this.myService.getString().subscribe(
      (response: string) => {
        // Split the response by commas and store it in the splitStrings array
        this.splitStrings = response.split(',').filter(str => !this.shouldFilter(str));
      },
      (error) => {
        console.error('Error fetching data', error);
      }
    );
  }

  private shouldFilter(str: string): boolean {
    // List of phrases to filter out
    const filterPhrases = [
      'Imprint/Promotion Label:',
      'Grammys 2025: Who Will Nab Nominations in the Top Country Categories?',
      'Gains in Weekly Performance',
      'Additional Awards'
    ];
    
    // Return true if the string contains any of the phrases
    return filterPhrases.some(phrase => str.includes(phrase));
  }
}
