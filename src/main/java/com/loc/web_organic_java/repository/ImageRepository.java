package com.loc.web_organic_java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loc.web_organic_java.models.Image;

public interface ImageRepository extends JpaRepository<Image,Long> {
    
        List<Image> findBySlug(String slug);
}
