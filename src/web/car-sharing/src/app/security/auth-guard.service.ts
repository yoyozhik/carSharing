import {Injectable} from '@angular/core';
import {CanActivate, Router} from '@angular/router';

@Injectable()
export class AuthGuardService implements CanActivate {
  constructor(private router: Router) {
  }

  canActivate(): boolean {
    if (!window.localStorage.getItem("id")) {
      this.router.navigate(['login']);
      return false;
    }
    return true;
  }

  canActivateChild(): boolean {
    if (!window.localStorage.getItem("id")) {
      this.router.navigate(['login']);
      return false;
    }
    return true;
  }
}
