package com.jerry.javad288.Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "carts")
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Cart_ID")
    private Long id;

    @Column(name = "Order_Tracking_Number")
    private String orderTrackingNumber;

    @Column(name = "Package_Price")
    private BigDecimal packagePrice;

    @Column(name = "Party_Size")
    private int partySize;

    @Column(name = "Status")
    private StatusType status;

    @CreationTimestamp
    @Column(name = "Create_Date")
    private Date createDate;

    @UpdateTimestamp
    @Column(name = "Last_Update")
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "Customer_ID")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carts")
    private Set<CartItem> cartItems = new HashSet<>();

    public void add(CartItem item){
        if (item != null) {
            if (cartItems == null) {
                cartItems = new HashSet<>();
            }
            cartItems.add(item);
            item.setCart(this);
        }
    }
}
