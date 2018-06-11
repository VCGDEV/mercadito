package com.vcg.mercadito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "ticket")
    private Set<Comments> comments;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "purchaseOrderId")
    private PurchaseOrder purchaseOrder;

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", usernameRequestor='" + usernameRequestor + '\'' +
                ", status='" + status + '\'' +
                ", createdDate=" + createdDate +
                ", cancelledDate=" + cancelledDate +
                ", closedDate=" + closedDate +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", closedDescription='" + closedDescription + '\'' +
                ", cancellationDescription='" + cancellationDescription + '\'' +
                ", comments=" + comments +
                '}';
    }
}
