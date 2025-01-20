package de.he.segallus.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "invoice_position_tax")
public class InvoicePositionTax implements Serializable {

    @Id
    @Column(name = "invoice_position_tax_id", unique = true, nullable = false)
    private long invoicePositionTaxId;

    @Column(name = "invoice_id", nullable = false)
    private long invoiceId;

    @Column(name = "position_number", nullable = false)
    private long positionNumber;

}
