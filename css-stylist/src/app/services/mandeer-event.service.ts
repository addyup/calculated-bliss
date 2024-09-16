import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface MandeerEvent {
  title: string;
  date: string;
  description: string;
}

@Injectable({
  providedIn: 'root',
})
export class EventService {
  private apiUrl = 'https://web-scrapius.onrender.com/api/events/upcoming'; // Update with the correct URL if deployed

  constructor(private http: HttpClient) {}

  getUpcomingEvents(): Observable<MandeerEvent[]> {
    return this.http.get<MandeerEvent[]>(this.apiUrl);
  }
}
