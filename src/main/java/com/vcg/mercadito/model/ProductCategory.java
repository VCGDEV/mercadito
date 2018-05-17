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
public class ProductCategory implements Serializable{
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String categoyrName;
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowVersion;
}
