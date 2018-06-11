package com.vcg.mercadito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comments implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;
    private String comment;
    private String username;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @OneToMany(mappedBy = "comments",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<AttachmentComment> attachments;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "ticketId")
    private Ticket ticket;

    @Override
    public String toString() {
        return "Comments{" +
                "commentId=" + commentId +
                ", comment='" + comment + '\'' +
                ", username='" + username + '\'' +
                ", createdDate=" + createdDate +
                ", attachments=" + attachments +
                '}';
    }
}
