package org.example.pavlichenko.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "payment")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@Setter
public class Payment {

    @Id
    @Column(name = "payment_id")
    Integer id;

    @Column(name = "customer_id")
    Integer customerId;

    @Column(name = "staff_id")
    Integer staffId;

    @Column(name = "rental_id")
    Integer rentalId;

    @Column(name = "amount")
    BigDecimal amount;

    @Column(name = "payment_date")
    Timestamp date;

    @Column(name = "last_update")
    Timestamp lastUpdate;
}
