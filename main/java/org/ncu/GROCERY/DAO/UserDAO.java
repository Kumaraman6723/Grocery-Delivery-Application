package org.ncu.GROCERY.DAO;
import java.util.List;

import org.ncu.GROCERY.ENTITY.User;
	

public interface UserDAO {
    User getUserById(int userId);	
    User saveOrUpdateUser(User user);
    void deleteUser(int userId);
    List<User> getAllUsers();
}
	