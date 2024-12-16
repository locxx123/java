package com.loc.web_organic_java.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loc.web_organic_java.services.ImageService;

import com.loc.web_organic_java.models.Image;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping("/getImageBySlug")
    public List<Image> getImageBySlug(@RequestParam String slug) {
        return imageService.getImageBySlug(slug);
    }

    @GetMapping("/hello123")
    public String sayHello() {
        return "Hello, World 123!";
    }
}
