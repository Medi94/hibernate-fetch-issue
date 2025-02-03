package de.he.segallus.entity.id;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class InvoicePositionId implements Serializable {

    @Id
    @Column(name = "invoice_id", nullable = false)
    private long invoiceId;

    @Id
    @Column(name = "position_number", nullable = false)
    private long positionNumber;

}
