import { Routes } from '@angular/router';
import { SignupComponent } from './signup/signup.component';

export const routes: Routes = [
  { path: 'checkitout', component: SignupComponent },
  { path: '', redirectTo: '/checkitout', pathMatch: 'full' }
];
