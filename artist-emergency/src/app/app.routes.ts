import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { FeaturesComponent } from './features/features.component';
import { ProfileComponent } from './profile/profile.component';
import { ArtistFormComponent } from './artist-form/artist-form.component';
import { ManagerFormComponent } from './manager-form/manager-form.component';

export const routes: Routes = [
    { path: '', redirectTo: '/home', pathMatch: 'full' }, // Redirect to home if no path is specified
    { path: 'home', component: HomeComponent },
    { path: 'features', component: FeaturesComponent},
    { path: 'add-profile', component: ProfileComponent},
    { path: 'artist-form', component: ArtistFormComponent },
    { path: 'manager-form', component: ManagerFormComponent }
];
