package services;

import models.Role;

import java.util.List;

public interface RoleService {

    Role findRoleById(long id);

    Role findRoleByName(String name);

    Role save(Role role);

    void deleteRoleById(long id);

    Role updateRole(Role role, long id);

    List<Role> findAllRoles();
}
