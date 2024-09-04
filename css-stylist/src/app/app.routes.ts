import { Routes } from '@angular/router';
import { LogoComponent } from './logo/logo.component';
import { SocialLinksComponent } from './social-links/social-links.component';
import { SignupComponent } from './signup/signup.component';

export const routes: Routes = [
  { path: 'signup', component: SignupComponent },
  { path: '', redirectTo: '/signup', pathMatch: 'full' }
];
