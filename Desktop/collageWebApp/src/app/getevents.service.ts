import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GeteventsService {

  constructor(private http:HttpClient) { }
  getevents(): Observable<any[]>{                                              // ✅ return type is any[]
    return this.http.get<any[]>("https://jsonplaceholder.typicode.com/photos");
  }
}
