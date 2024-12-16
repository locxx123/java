package com.loc.web_organic_java.interfaces;

import java.util.List;

import com.loc.web_organic_java.models.Image;
import com.loc.web_organic_java.models.Product;

public interface ImageInterface {
    public List<Image> getImageBySlug(String slug);
}
