package com.vcg.mercadito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="module_permissions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModulePermission implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long modulePermissionId;
    private String permissionName;
    private String permissionCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "moduleId")
    private Module module;

    @Override
    public String toString() {
        return "ModulePermission{" +
                "modulePermissionId=" + modulePermissionId +
                ", permissionName='" + permissionName + '\'' +
                ", permissionCode='" + permissionCode + '\'' +
                '}';
    }
}
