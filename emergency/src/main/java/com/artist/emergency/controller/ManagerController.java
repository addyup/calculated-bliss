package com.artist.emergency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.artist.emergency.model.Manager;
import com.artist.emergency.service.ManagerService;

import java.util.List;

@RestController
@RequestMapping("/api/managers")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping
    public List<Manager> getAllManagers() {
        return managerService.getAllManagers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manager> getManagerById(@PathVariable Long id) {
        Manager manager = managerService.getManagerById(id);
        if (manager != null) {
            return ResponseEntity.ok(manager);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Manager createManager(@RequestBody Manager manager) {
        return managerService.saveManager(manager);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Manager> updateManager(@PathVariable Long id, @RequestBody Manager manager) {
        Manager existingManager = managerService.getManagerById(id);
        if (existingManager != null) {
            manager.setId(id);
            return ResponseEntity.ok(managerService.saveManager(manager));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteManager(@PathVariable Long id) {
        Manager manager = managerService.getManagerById(id);
        if (manager != null) {
            managerService.deleteManager(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}