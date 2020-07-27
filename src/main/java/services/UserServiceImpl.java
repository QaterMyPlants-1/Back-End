package services;

import Exceptions.ResourceNotFoundException;
import models.Role;
import models.User;
import models.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.UserRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Transactional
@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userrepo;

    @Autowired
    private RoleService roleService;

    @Override
    public User findUserById(long id) {
        return null;
    }



    @Transactional
    @Override
    public User save(User user) throws Throwable {

        User newUser = new User();


        if(user.getUserId() != 0) {
            userrepo.findById(user.getUserId()).orElseThrow(() ->
                    new ResourceNotFoundException("User id" + user.getUserId() + " not found!"));
            newUser.setUserId(user.getUserId());
        }

        newUser.setUsername(user.getUsername());
        newUser.setPhonenumber(user.getPhonenumber());
        newUser.setPasswordNoEncrypt(user.getPassword());

        newUser.getRoles().clear();
        for(UserRole r : user.getRoles()) {
            Role addRole =  roleService.findRoleById(r.getRole().getRoleId());
            newUser.getRoles().add(new UserRole(newUser, addRole));
        }

        return userrepo.save(newUser);

    }

    @Override
    public void deleteUserById(long id) throws Throwable {
        userrepo.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("User with id of " + id +" was not found!"));
        userrepo.deleteById(id);
    }

    @Override
    public User updateUser(User user, long id) {

        return null;
    }

    @Override
    public void addRole(long userid, long roleid) {

    }

    @Override
    public void deleteRole(long userid, long roleid) {

    }

//    @Override
   public List<User> findAllUsers() {
//        List<User> list = new ArrayList<>();
//        userrepo.findAll().iterator().forEachRemaining(list::add);
//        return list;
       return null;
    }
}
