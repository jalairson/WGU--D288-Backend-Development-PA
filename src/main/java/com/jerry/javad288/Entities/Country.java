package com.jerry.javad288.Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "countries")
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String divisionName;

    @CreationTimestamp
    @Column(name = "Create_Date")
    private Date createDate;

    @UpdateTimestamp
    @Column(name = "Last_Update")
    private Date lastUpdate;

    @Column(name = "Country_ID")
    private Long countryID;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Division> divisions;

}
