package com.vcg.mercadito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PurchaseOrder implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseOrderId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    private String orderStatus;
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliverDate;
    private Integer orderRate;
    private Double total;
}
