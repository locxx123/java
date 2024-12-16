package com.loc.web_organic_java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loc.web_organic_java.dto.CartProductDTO;
import com.loc.web_organic_java.interfaces.CartInterface;
import com.loc.web_organic_java.models.Cart;
import com.loc.web_organic_java.repository.CartRepository;

import jakarta.transaction.Transactional;

@Service
public class CartService implements CartInterface{
    @Autowired
    private CartRepository cartRepository;

    @Override
    public List<Cart> getCartItemsByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }

    @Override
    public List<CartProductDTO> getCartProductsByUserId(Long userId) {
        return cartRepository.findCartProductsByUserId(userId);
    }

    @Override
    @Transactional
    public boolean updateCartNum(Long id, Long userId, String num) {
        int rowsAffected = cartRepository.updateNumByIdAndUserId(id, userId, num);
        return rowsAffected > 0; // Return true if at least one row was updated
    }
}
