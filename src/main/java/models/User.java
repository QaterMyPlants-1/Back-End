package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "users")
public class User
    extends Auditable {

    @Id
    @GeneratedValue
    private long userId;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;


    private String phonenumber;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "user", allowSetters = true)
    private List<UserRole> roleList = new ArrayList<>();


    public User() {
    }

    public User(String username, String password, String phonenumber, List<UserRole> roleList) {
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
        this.roleList = roleList;
    }


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public List<UserRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<UserRole> roleList) {
        this.roleList = roleList;
    }


}
