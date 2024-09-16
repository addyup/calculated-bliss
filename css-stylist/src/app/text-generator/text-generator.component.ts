import { Component } from '@angular/core';
import { OpenaiService } from '../services/openai.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-text-generator',
  templateUrl: './text-generator.component.html',
  imports:[FormsModule],
  standalone: true,
  styleUrls: ['./text-generator.component.less']
})
export class TextGeneratorComponent {
  prompt: string = '';
  generatedText: string = '';

  constructor(private openaiService: OpenaiService) {}

  generateText() {
    this.openaiService.generateText(this.prompt).subscribe(
      (response: string) => {
        this.generatedText = response;
      },
      (error) => {
        console.error('Error generating text:', error);
      }
    );
  }
}
