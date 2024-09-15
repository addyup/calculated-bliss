import { Component, Inject, OnInit } from '@angular/core';
import { EventService, MandeerEvent } from '../services/mandeer-event.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-mandeer-event-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './mandeer-event-list.component.html',
  styleUrl: './mandeer-event-list.component.less'
})
export class MandeerEventListComponent implements OnInit {
  events: MandeerEvent[] = [];


  constructor(private eventService: EventService) {}

  ngOnInit(): void {
    this.eventService.getUpcomingEvents().subscribe(
      (data) => {
        this.events = data;
      },
      (error) => {
        console.error('Error fetching events:', error);
      }
    );
  }
}
