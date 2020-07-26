package repositories;

import models.Role;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface RoleRepository extends CrudRepository {

    Role findByNameIgnoreCase(long name);


    @Transactional
    @Modifying
    @Query(value = "UPDATE roles SET name = :name, last_modified_by = :uname, last_modified_date = CURRENT_TIMESTAMP " +
            "WHERE roleid = :roleid",
            nativeQuery = true)
    void updateRoleName(
            String uname,
            long roleid,
            String name);

}

