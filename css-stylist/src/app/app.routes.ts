import { Routes } from '@angular/router';
import { SignupComponent } from './signup/signup.component';

export const routes: Routes = [
  { path: 'checkitoutt', component: SignupComponent },
  { path: '', redirectTo: '/checkitoutt', pathMatch: 'full' }
];
