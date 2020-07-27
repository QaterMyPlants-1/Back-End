package services;

import models.User;

import java.util.List;

public interface UserService {

    User findUserById(long id);

    User save(User user) throws Throwable;

    void deleteUserById(long id) throws Throwable;

    User updateUser(User user, long id);

    void addRole(long userid, long roleid);

    void deleteRole(long userid, long roleid);

    List<User> findAllUsers();
}
