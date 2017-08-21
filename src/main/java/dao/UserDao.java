package dao;

import java.util.List;

import beans.User;

public interface UserDao {
    public User getUserById(int userId);

    public List<User> getAllUsers();

    public void addNewUser(User user);

    public boolean updateUser(User user);
}
