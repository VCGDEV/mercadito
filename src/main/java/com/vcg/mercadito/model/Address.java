package com.vcg.mercadito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String country;
    private String government;
    private String city;
    private String suburb;
    private String street;
    private String postalCode;
    private Double latitude;
    private Double longitude;
    @Column(name = "default")
    private Boolean defaultAddress;
    @ManyToOne(cascade = CascadeType.ALL,fetch =FetchType.LAZY)
    @JoinColumn(name = "user_app_id")
    private UserApp userApp;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="geographic_zone_id")
    private GeographicZone geographicZone;
}
