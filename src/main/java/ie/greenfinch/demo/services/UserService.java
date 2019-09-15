package ie.greenfinch.demo.services;

import java.util.Optional;

import ie.greenfinch.demo.models.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}