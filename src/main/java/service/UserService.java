package service;

import java.util.List;

import org.springframework.stereotype.Component;

import beans.User;
import dao.UserDao;
import dao.UserDaoImpl;

@Component
public class UserService {
    UserDao userDao = new UserDaoImpl();

    public User getUserById(int userId){
        User user = userDao.getUserById(userId);
        return user;
    }

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    public void addNewUser(User user){
        userDao.addNewUser(user);
    }
}
