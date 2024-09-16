import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OpenaiService {
  private apiUrl = 'http://localhost:8080/api/openai/generate'; // Spring Boot API endpoint

  constructor(private http: HttpClient) {}

  generateText(prompt: string): Observable<string> {
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
    return this.http.post<string>(this.apiUrl, prompt, { headers });
  }
}