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
public class Attachments implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attachmentId;
    private String contentType;
    private byte[] content;
}
