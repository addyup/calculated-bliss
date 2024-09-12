import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class BillboardService {
  private apiUrl = 'https://calculated-bliss.onrender.com/api/billboard/top-songs';

  constructor(private http: HttpClient) {}

  getTopSongs(): Observable<string[]> {
    return this.http.get<string[]>(this.apiUrl);
  }
}