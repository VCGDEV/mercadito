package com.vcg.mercadito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttachmentComment implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attachmentCommentId;
    private String contentType;
    private byte[] content;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "commentId")
    private Comments comments;

    @Override
    public String toString() {
        return "AttachmentComment{" +
                "attachmentCommentId=" + attachmentCommentId +
                ", contentType='" + contentType + '\'' +
                ", content=" + content!=null ? content.length+"" : "" +
                '}';
    }
}
