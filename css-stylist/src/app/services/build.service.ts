import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

export interface BuildDetails {
  name: string;
  buildType: string;
  multiLevelDetail?: string;  // Optional field
  phoneNumber: string;
  email: string;
}


@Injectable({
  providedIn: 'root'
})
export class BuildService {
  

  constructor(private http: HttpClient) {}

  submitBuildDetails(formData: any): Observable<any> {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
    });
  
    // Explicitly convert formData to JSON if needed
    console.log(formData);
    return this.http.post<any>('http://localhost:8080/api/build-details', JSON.stringify(formData), { headers });
  }
}
