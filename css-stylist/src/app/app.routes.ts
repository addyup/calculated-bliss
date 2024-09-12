import { Routes } from '@angular/router';
import { SignupComponent } from './signup/signup.component';

export const routes: Routes = [
  { path: 'leflair', component: SignupComponent },
  { path: '', redirectTo: '/leflair', pathMatch: 'full' }
];
