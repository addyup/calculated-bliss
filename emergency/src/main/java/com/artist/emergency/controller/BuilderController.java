package com.artist.emergency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.artist.emergency.model.Builder;
import com.artist.emergency.service.BuilderService;

import java.util.List;

@RestController
@RequestMapping("/api/builders")
public class BuilderController {

    @Autowired
    private BuilderService builderService;

    @GetMapping
    public List<Builder> getAllBuilders() {
        return builderService.getAllBuilders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Builder> getBuilderById(@PathVariable Long id) {
        Builder builder = builderService.getBuilderById(id);
        if (builder != null) {
            return ResponseEntity.ok(builder);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Builder createBuilder(@RequestBody Builder builder) {
        return builderService.saveBuilder(builder);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Builder> updateBuilder(@PathVariable Long id, @RequestBody Builder builder) {
        Builder existingBuilder = builderService.getBuilderById(id);
        if (existingBuilder != null) {
            builder.setId(id);
            return ResponseEntity.ok(builderService.saveBuilder(builder));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBuilder(@PathVariable Long id) {
        Builder builder = builderService.getBuilderById(id);
        if (builder != null) {
            builderService.deleteBuilder(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}