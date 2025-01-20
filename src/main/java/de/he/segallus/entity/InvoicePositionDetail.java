package de.he.segallus.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "invoice_position_detail")
public class InvoicePositionDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_position_detail_id", nullable = false)
    private long invoicePositionDetailId;

    @Column(name = "position_number", nullable = false)
    private long positionNumber;
}
