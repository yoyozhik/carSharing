import 'rxjs/add/operator/toPromise';
import {Injectable} from '@angular/core';
import {Profile} from "../domain/profile";
import {Http} from "@angular/http";

@Injectable()
export class ProfileService {

  private profileUrl = '/api/profile/';

  constructor(private http: Http) {
  }

  getProfile(): Promise<Profile> {
    return this.http.get(this.profileUrl)
      .toPromise()
      .then(response => response.json() as Profile)
      .catch(this.handleError);
  }

  createProfile(profile: Profile): Promise<Profile> {
    return this.http
      .post("api/registration", profile)
      .toPromise()
      .then(response => response.json() as Profile)
      .catch(this.handleError);
  }

  updateProfile(profile: Profile): Promise<Profile> {
    return this.http
      .put(this.profileUrl, profile)
      .toPromise()
      .then(response => response.json() as Profile)
      .catch(this.handleError);
  }

  deleteProfile(): Promise<void> {
    return this.http
      .delete(this.profileUrl)
      .toPromise()
      .then()
      .catch(this.handleError)
  }

  confirmProfile() {
    return this.http
      .put(this.profileUrl + "/check-to-confirm", {})
      .toPromise()
      .then()
      .catch(this.handleError)
  }

  uploadAvatar(file: FormData) {
    return this.http
      .put(this.profileUrl + "avatar", file)
      .toPromise()
      .then(profile => profile.json() as Profile)
      .catch(this.handleError)
  }

  deleteAvatar() {
    return this.http
      .delete(this.profileUrl + "avatar")
      .toPromise()
      .then(profile => profile.json() as Profile)
      .catch(this.handleError)
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occured', error);
    return Promise.reject(error.json().message || error)
  }
}
