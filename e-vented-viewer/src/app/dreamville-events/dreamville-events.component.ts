import { Component, OnInit } from '@angular/core';
import { EventService } from '../event.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-dreamville-events',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './dreamville-events.component.html',
  styleUrls: ['./dreamville-events.component.css']
})
export class DreamvilleEventsComponent implements OnInit {
  events: string | null = null;

  constructor(private eventService: EventService) {}

  ngOnInit(): void {
    this.eventService.getDreamvilleEvents().subscribe(
      (data: string) => {
        this.events = data;
      },
      (error) => {
        console.error('Error fetching Dreamville events', error);
      }
    );
  }
}