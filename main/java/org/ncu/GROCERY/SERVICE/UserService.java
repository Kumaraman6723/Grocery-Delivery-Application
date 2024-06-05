package org.ncu.GROCERY.SERVICE;



import java.util.List;

import org.ncu.GROCERY.ENTITY.User;

public interface UserService {
    User getUserById(int userId);
    User saveOrUpdateUser(User user);
    void deleteUser(int userId);
    List<User> getAllUsers();
}

