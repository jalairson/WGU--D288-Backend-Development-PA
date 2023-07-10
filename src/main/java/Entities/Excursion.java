package Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "excursions")
@Data
public class Excursion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Excursion_ID")
    private Long id;

    @Column(name = "Excursion_Title")
    private String excursionTitle;

    @Column(name = "Excursion_Price")
    private BigDecimal excursionPrice;

    @Column(name = "Image_URL")
    private String ImageUrl;

    @CreationTimestamp
    @Column(name = "Create_Date")
    private Date createDate;

    @UpdateTimestamp
    @Column(name = "Last_Update")
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "Vacation_ID")
    private Vacation vacation;

    private Set<CartItem> cartItems;

}
