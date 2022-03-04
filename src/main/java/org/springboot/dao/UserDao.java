package org.springboot.dao;

import org.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User,Long> {
    void update(long id, User user);
}
