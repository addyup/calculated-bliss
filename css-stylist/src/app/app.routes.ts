import { Routes } from '@angular/router';
import { LogoComponent } from './logo/logo.component';
import { SocialLinksComponent } from './social-links/social-links.component';

export const routes: Routes = [
    { path: '', component: LogoComponent },
  { path: 'social-links', component: SocialLinksComponent }
];
