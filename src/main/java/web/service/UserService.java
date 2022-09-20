package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> readUsers();
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser (User user);
}
