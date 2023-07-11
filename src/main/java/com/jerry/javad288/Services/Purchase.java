package com.jerry.javad288.Services;

import com.jerry.javad288.Entities.Cart;
import com.jerry.javad288.Entities.CartItem;
import com.jerry.javad288.Entities.Customer;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;

}
