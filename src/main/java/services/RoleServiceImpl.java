package services;


import models.Role;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {
    @Override
    public Role findRoleById(long id) {
        return null;
    }

    @Override
    public Role findRoleByName(String name) {
        return null;
    }

    @Override
    public Role save(Role role) {
        return null;
    }

    @Override
    public void deleteRoleById(long id) {

    }

    @Override
    public Role updateRole(Role role, long id) {
        return null;
    }

    @Override
    public List<Role> findAllRoles() {
        return null;
    }
}
