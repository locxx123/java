package com.loc.web_organic_java.controllers;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loc.web_organic_java.dto.CartProductDTO;
import com.loc.web_organic_java.models.Cart;
import com.loc.web_organic_java.models.User;
import com.loc.web_organic_java.services.CartService;
import com.loc.web_organic_java.services.ProductService;
import com.loc.web_organic_java.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class CartController {
    @Autowired
    private UserService userService;

    @Autowired
    private CartService cartService;

    @Autowired
    private ProductService productService;

    @PostMapping("/cart/my_cart")
    public List<CartProductDTO> getUserId(@RequestBody TokenRequest tokenRequest) {
        // Get token
        User user = userService.getUserByToken(tokenRequest.getToken());

        Long userId = user.getId();
        List<CartProductDTO> cartProducts = cartService.getCartProductsByUserId(userId);
        return  cartProducts;
    }

    @PostMapping("/cart/update_cart")
    public List<CartProductDTO> updateCart(@RequestBody TokenRequest tokenRequest) {
        Long id = tokenRequest.getId();
        String num = tokenRequest.getNewNum();
        User user = userService.getUserByToken(tokenRequest.getToken());
        Long userId = user.getId();

        boolean updated = cartService.updateCartNum(id, userId, num);
        if (updated) {
            List<CartProductDTO> cartProducts = cartService.getCartProductsByUserId(userId);
            return  cartProducts;
        }
        return null; 
    }

    public static class TokenRequest {
        private String token;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
        private String newNum;

        public String getNewNum() {
            return newNum;
        }

        public void setNewNum(String newNum) {
            this.newNum = newNum;
        }

        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
}
