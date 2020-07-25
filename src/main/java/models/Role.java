package models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role")
public class Role
    extends Auditable {
        @Id
        @GeneratedValue
        public long roleId;

        @Column(nullable = false, unique = true)
        private String currentRole;

        @OneToMany(mappedBy = "roles", cascade = CascadeType.ALL)
        @JsonIgnoreProperties(value = "role", allowSetters = true)
        private List<UserRole> userList = new ArrayList<>();

    public Role() {
    }

    public Role(long roleId, String currentRole, List<UserRole> userList) {
        this.roleId = roleId;
        this.currentRole = currentRole;
        this.userList = userList;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getCurrentRole() {
        return currentRole;
    }

    public void setCurrentRole(String currentRole) {
        this.currentRole = currentRole.toUpperCase();
    }

    public List<UserRole> getUserList() {
        return userList;
    }

    public void setUserList(List<UserRole> userList) {
        this.userList = userList;
    }


}
