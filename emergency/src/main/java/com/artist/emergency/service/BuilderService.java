package com.artist.emergency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artist.emergency.model.Builder;
import com.artist.emergency.repository.BuilderRepository;

import java.util.List;

@Service
public class BuilderService {

    @Autowired
    private BuilderRepository builderRepository;

    public List<Builder> getAllBuilders() {
        return builderRepository.findAll();
    }

    public Builder getBuilderById(Long id) {
        return builderRepository.findById(id).orElse(null);
    }

    public Builder saveBuilder(Builder builder) {
        return builderRepository.save(builder);
    }

    public void deleteBuilder(Long id) {
        builderRepository.deleteById(id);
    }
}