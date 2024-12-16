package com.loc.web_organic_java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.loc.web_organic_java.dto.CartProductDTO;
import com.loc.web_organic_java.interfaces.ProductQuantityDTO;
import com.loc.web_organic_java.models.Cart;

import jakarta.transaction.Transactional;

public interface CartRepository extends JpaRepository<Cart,Long>{
    List<Cart> findByUserId(Long userId);

    @Query(
        """
        SELECT new com.loc.web_organic_java.dto.CartProductDTO(
            c.id,
            c.userId, 
            c.productId, 
            c.num,
            p.name, 
            p.image, 
            p.price
            
        )
           FROM Cart c 
           JOIN Product p ON c.productId = p.id
           WHERE c.userId = :userId
                   
                   """
        )
    List<CartProductDTO> findCartProductsByUserId(Long userId);

    @Modifying
    @Transactional
    @Query("UPDATE Cart c SET c.num = :num WHERE c.id = :id AND c.userId = :userId")
    int  updateNumByIdAndUserId(Long id,Long userId, String num);


    
}
