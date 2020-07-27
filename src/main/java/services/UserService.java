package services;

import models.User;

import java.util.List;

public interface UserService {

    User findUserById(long id);

    User save(User user);

    void deleteUserById(long id);

    User updateUser(User user, long id);

    void addRole(long userid, long roleid);

    void deleteRole(long userid, long roleid);

    List<User> findAllUsers();
}
