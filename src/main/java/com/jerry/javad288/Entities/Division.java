package com.jerry.javad288.Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "divisions")
@Data
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Division_ID")
    private Long id;

    @Column(name = "Division")
    private String divisionName;

    @CreationTimestamp
    @Column(name = "Create_Date")
    private Date createDate;

    @UpdateTimestamp
    @Column(name = "Last_Update")
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "Country_ID")
    private Country country;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Customer> customers;

}
