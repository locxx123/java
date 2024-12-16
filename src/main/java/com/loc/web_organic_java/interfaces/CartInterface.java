package com.loc.web_organic_java.interfaces;

import java.util.List;

import com.loc.web_organic_java.dto.CartProductDTO;
import com.loc.web_organic_java.models.Cart;

public interface CartInterface {
    public List<Cart> getCartItemsByUserId(Long userId);

    public List<CartProductDTO> getCartProductsByUserId(Long userId);

    public boolean updateCartNum(Long id, Long userId, String num);
}
