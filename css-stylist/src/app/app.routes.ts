import { RouterModule, Routes } from '@angular/router';
import { SignupComponent } from './signup/leflair.component';
import { CandidateCbeFormComponent } from './candidate-cbe-form/candidate-cbe-form.component';
import { FormSubmittedSuccessComponent } from './form-submitted-success/form-submitted-success.component';

export const routes: Routes = [
  { path: 'leflair', component: SignupComponent },
  { path: '', redirectTo: '/leflair', pathMatch: 'full' },
  { path: 'candidate-form', component: CandidateCbeFormComponent },
  { path: 'form-submitted-success', component: FormSubmittedSuccessComponent },
];

