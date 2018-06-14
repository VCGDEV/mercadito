package com.vcg.mercadito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductCategory implements Serializable{
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String categoyrName;
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowVersion;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "attachment_id")
    private Attachments attachment;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "productCategory",fetch = FetchType.LAZY)
    private Set<Product> products;
}
