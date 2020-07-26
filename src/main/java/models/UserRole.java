package models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "userroles")
public class UserRole
    extends Auditable {

    @Id
    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonIgnoreProperties(value = "roles", allowSetters = true)
    private User user;


    @Id
    @ManyToOne
    @JoinColumn(name = "roleId")
    @JsonIgnoreProperties(value = "users", allowSetters = true)
    private Role role;

    public UserRole() {
    }

    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof UserRole))
        {
            return false;
        }
        UserRole that = (UserRole) o;
        return ((user == null) ? 0 : user.getUserId()) == ((that.user == null) ? 0 : that.user.getUserId()) &&
                ((role == null) ? 0 : role.getRoleId()) == ((that.role == null) ? 0 : that.role.getRoleId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(user.getUserId(), role.getRoleId());
    }
}
