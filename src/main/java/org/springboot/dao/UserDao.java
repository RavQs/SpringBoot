package org.springboot.dao;

import org.springboot.model.User;
import java.util.List;


public interface UserDao {
    List<User> index();

    User showUserById(long id);

    void save(User user);

    void update(long id, User user);

    void delete(long id);
}
