import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EventService {
  // private baseUrl = 'http://localhost:8080/api/events'; 

  private baseUrl = 'https://calculated-bliss.onrender.com/api/events';

  constructor(private http: HttpClient) {}

  getDreamvilleEvents(): Observable<string> {
    const headers = new HttpHeaders({
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Credentials': 'true',
                'Access-Control-Allow-Headers': 'Content-Type',
                'Access-Control-Allow-Methods': 'GET,PUT,POST,DELETE'
    });

    return this.http.get(`${this.baseUrl}/dreamville`, { headers: headers, responseType: 'text' });
  }
}