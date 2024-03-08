package com.swp.birthdaybooking.controllers;

import com.swp.birthdaybooking.entities.Cart;
import com.swp.birthdaybooking.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/cart")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public List<Cart> getAllCarts() {
        return cartService.findAll();
    }

    @PostMapping
    public void addNewCart(@RequestBody Cart cart){
        cartService.addNewCart(cart);
    }

    @PostMapping
    public void deleteCart(@RequestBody Cart cart){
        cartService.deleteCart(cart);
    }
}
