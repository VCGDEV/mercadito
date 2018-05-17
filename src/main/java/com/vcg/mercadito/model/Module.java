package com.vcg.mercadito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "modules")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Module implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long moduleId;
    private String moduleName;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "module")
    private Set<ModulePermission> permissions;
}
