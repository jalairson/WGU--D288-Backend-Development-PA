package com.jerry.javad288.Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name="customers")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer_ID")
    private Long id;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Address")
    private String address;

    @Column(name = "Postal_Code")
    private String postalCode;

    @Column(name = "Phone")
    private String phone;

    @CreationTimestamp
    @Column(name = "Create_Date")
    private Date createDate;

    @UpdateTimestamp
    @Column(name = "Last_Update")
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "Division_ID")
    private Division division;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cart> carts;


}
