package de.he.segallus.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import de.he.segallus.entity.id.InvoicePositionId;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "invoice_position")
@IdClass(InvoicePositionId.class)
public class InvoicePosition implements Serializable {

    @Id
    private long invoiceId;

    @Id
    private long positionNumber;

    @Column(name = "invoice_position_group_id")
    private Long invoicePositionGroupId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_id", referencedColumnName = "invoice_id")
    @JoinColumn(name = "position_number", referencedColumnName = "position_number")
    private Set<InvoicePositionDetail> invoicePositionDetails;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_id", referencedColumnName = "invoice_id")
    @JoinColumn(name = "position_number", referencedColumnName = "position_number")
    private List<InvoicePositionTax> invoicePositionTaxes;
}
