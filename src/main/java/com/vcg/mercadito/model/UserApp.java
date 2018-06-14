package com.vcg.mercadito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

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
    @Column(unique = true)
    private String username;
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_template_id",nullable = false)
    private ProfileTemplate profileTemplate;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "geographic_zone_id",nullable = true)
    private GeographicZone geographicZone;
    @OneToMany(mappedBy = "userApp",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Address> addresses;
}
