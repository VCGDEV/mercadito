package com.vcg.mercadito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ticket implements Serializable{
    private Long ticketId;
    private String usernameRequestor;
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date cancelledDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date closedDate;
    private String subject;
    private String description;
    private String closedDescription;
    private String cancellationDescription;
}
