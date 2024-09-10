package com.elephantScrape.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elephantScrape.demo.entity.UserDetailsArtistSubmission;
import com.elephantScrape.demo.repository.UserDetailsRepository;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    // POST method to submit details and save to database
    @PostMapping("/submit")
    public String submitForm(@RequestBody UserDetailsArtistSubmission userDetails) {

        userDetailsRepository.save(userDetails);
        return "Details saved successfully!";
    }

    // GET method to retrieve all saved user details from database
    @GetMapping("/get")
    public List<UserDetailsArtistSubmission> getAllUserDetails() {
        return userDetailsRepository.findAll();
    }

}