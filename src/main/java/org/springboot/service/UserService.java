package org.springboot.service;

import org.springboot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> index();
    User showUserById(Long id);
    void save(User user);
    void update (long id, User user);
    void delete(long id);

}
