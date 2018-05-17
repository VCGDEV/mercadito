package com.vcg.mercadito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RecoverPasswordRequest implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recoverPasswordId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    private String shaEncode;
    private Boolean used;
    private String userAppUsername;
}
