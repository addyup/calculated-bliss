import { Component, OnInit } from '@angular/core';
import { BillboardService } from '../services/billboard.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-billboard-songs',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './billboard-songs.component.html',
  styleUrls: ['./billboard-songs.component.css'],
})
export class BillboardSongsComponent implements OnInit {
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  
}