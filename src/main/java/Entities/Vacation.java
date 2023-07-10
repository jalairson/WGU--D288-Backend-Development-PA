package Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "vacations")
@Data
public class Vacation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Vacation_ID")
    private Long id;

    @Column(name = "Vacation_Title")
    private String vacationTitle;

    @Column(name = "Description")
    private String description;

    @Column(name = "Travel_Fare")
    private BigDecimal travelPrice;

    @Column(name = "Image_URL")
    private String imageUrl;

    @CreationTimestamp
    @Column(name = "Create_Date")
    private Date createDate;

    @UpdateTimestamp
    @Column(name = "Last_Update")
    private Date lastUpdate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vacations")
    private Set<Excursion> excursions;

}
