import { Component, OnInit } from '@angular/core';
import { MinecraftService } from '../services/minecraft.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-minecraft',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './minecraft.component.html',
  styleUrl: './minecraft.component.less'
})
export class MinecraftComponent implements OnInit {
  players: any[] = [];
  blocks: any[] = [];
  newPlayer: any = { name: '', x: 0, y: 0, z: 0 };
  newBlock: any = { type: '', x: 0, y: 0, z: 0 };

  constructor(private minecraftService: MinecraftService) { }

  ngOnInit(): void {
    this.loadPlayers();
    this.loadBlocks();
  }

  loadPlayers() {
    this.minecraftService.getPlayers().subscribe(data => {
      this.players = data;
    });
  }

  loadBlocks() {
    this.minecraftService.getBlocks().subscribe(data => {
      this.blocks = data;
    });
  }

  addPlayer() {
    this.minecraftService.addPlayer(this.newPlayer).subscribe(() => {
      this.loadPlayers();
    });
  }

  placeBlock() {
    this.minecraftService.placeBlock(this.newBlock).subscribe(() => {
      this.loadBlocks();
    });
  }
}
