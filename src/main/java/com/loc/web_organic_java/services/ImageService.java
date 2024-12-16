package com.loc.web_organic_java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loc.web_organic_java.interfaces.ImageInterface;
import com.loc.web_organic_java.models.Image;
import com.loc.web_organic_java.repository.ImageRepository;

@Service
public class ImageService implements ImageInterface{
    @Autowired
    private ImageRepository imageRepository;

    @Override
    public List<Image> getImageBySlug(String slug) {
        return imageRepository.findBySlug(slug);
    }
}
