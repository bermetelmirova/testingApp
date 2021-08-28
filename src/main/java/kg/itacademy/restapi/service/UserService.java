package kg.itacademy.restapi.service;

import kg.itacademy.restapi.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(Long id);
    User save(User user);
    User deleteById(Long id);
}
