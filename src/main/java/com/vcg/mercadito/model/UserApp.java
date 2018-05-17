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
public class UserApp implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userAppId;
    private String username;
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
}
