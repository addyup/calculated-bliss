import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MinecraftService {
  private apiUrl = 'http://localhost:8080/api/game';

  constructor(private http: HttpClient) { }

  getPlayers(): Observable<any> {
    return this.http.get(`${this.apiUrl}/players`);
  }

  addPlayer(player: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/players`, player);
  }

  getBlocks(): Observable<any> {
    return this.http.get(`${this.apiUrl}/blocks`);
  }

  placeBlock(block: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/blocks`, block);
  }
}