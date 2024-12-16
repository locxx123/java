package com.loc.web_organic_java.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cart")
public class Cart { 
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private long id;
    private String name;
    private String image;
    private String price;

    @Column(name="user_id")
    private long userId;

    @Column(name="product_id")
    private long productId;

    @Column(name="num")
    private String num;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    
}
