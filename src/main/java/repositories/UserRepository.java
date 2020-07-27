package repositories;

import models.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface UserRepository extends CrudRepository {
    User findByUsername(String name);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM userroles where userid = :userid AND roleid = :roleid", nativeQuery = true)
    void deleteUserRoles(long userid, long roleid);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO userroles(userid, roleid, created_by, created_date, last_modified_by, last_modified_date) " +
            "VALUES (:userid, :roleid, :uname, CURRENT_TIMESTAMP, :uname, CURRENT_TIMESTAMP)", nativeQuery = true)
    void insertRoles(String uname, long userid, long roleid);

}
