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
public class Product implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowVersion;
    private String name;
    private Boolean active;
    private Double priceCustomer;
    private Double priceOnSale;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "attachment_id")
    private Attachments attachment;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private ProductCategory productCategory;

}
