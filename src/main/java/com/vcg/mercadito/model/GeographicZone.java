package com.vcg.mercadito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GeographicZone implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long greographicZoneId;
    private String name;
    private String geofencePoints;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "geographicZone",cascade = CascadeType.ALL)
    private Set<UserApp> userApps;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "geographicZone",cascade = CascadeType.ALL)
    private Set<Address> addresses;
}
