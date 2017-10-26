import 'rxjs/add/operator/toPromise';
import { Injectable } from '@angular/core';
import {Http} from "@angular/http";
import {PassportData} from "./passport-data";

@Injectable()
export class PassportDataService {

  private passportUrl = '/api/passport-data';

  constructor(private http: Http) { }

  getPassport(id: number): Promise<PassportData> {
    const url = `${this.passportUrl}/${id}`;
    return this.http.get(url)
      .toPromise()
      .then(response => response.json() as PassportData)
      .catch(this.handleError);
  }

  updatePassport(passportData:PassportData, id:number): Promise<PassportData> {
    const url = `${this.passportUrl}/${id}`;
    return this.http
      .put(url, passportData)
      .toPromise()
      .then(() => passportData)
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occured', error);
    return Promise.reject(error.message || error)
  }
}