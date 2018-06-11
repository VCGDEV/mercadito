package com.vcg.mercadito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PurchaseDetail implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long purchaseDetailId;
    private Double quantity;
    private Double price;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "purchaseOrderId")
    private PurchaseOrder purchaseOrder;
    @OneToOne(cascade = CascadeType.DETACH,fetch = FetchType.LAZY)
    @JoinColumn(name="productId")
    private Product product;
}
