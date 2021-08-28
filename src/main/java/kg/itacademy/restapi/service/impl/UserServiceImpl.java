package kg.itacademy.restapi.service.impl;

import kg.itacademy.restapi.entity.User;
import kg.itacademy.restapi.repository.UserRepository;
import kg.itacademy.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User deleteById(Long id) {
        User user = getById(id);
        userRepository.deleteById(id);
        return user;
    }
}
