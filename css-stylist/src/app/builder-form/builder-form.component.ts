import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BuildService } from '../services/build.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-builder-form',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './builder-form.component.html',
  styleUrl: './builder-form.component.less'
})
export class BuilderFormComponent {
  formData = { name: '', buildType: '', multiLevelDetail: '', phoneNumber: '', email: '' };
  showMultiLevelInput = false;

  responseMessage = '';

  // constructor(private buildService: BuildService, private router: Router) {}

  onBuildTypeChange() {
    this.showMultiLevelInput = this.formData.buildType === 'multi-level';
  }

  constructor(private http: HttpClient, private router: Router) {} 

  onSubmit() {
    this.http.post('https://web-scrapius.onrender.com/api/build-details', this.formData)
      .subscribe((response: any) => {
        this.responseMessage = response;
        this.router.navigate(['/form-submitted']); // Redirect to success page
      }, (_error) => {
        this.responseMessage = 'Error sending candidate details';
      });
  }

  // onSubmit() {
  //   this.buildService.submitBuildDetails(this.formData).subscribe(
  //     (_response) => {
  //       this.router.navigate(['/form-submitted']);
  //     },
  //     (error) => {
  //       console.error('Error submitting form', error);
  //       this.formData = { name: '', buildType: '', multiLevelDetail: '', phoneNumber: '', email: '' };
  //     }
  //   );
  // }
}
