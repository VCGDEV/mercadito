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
}
