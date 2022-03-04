package org.springboot.service;


import org.springboot.model.User;
import org.springboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> index() {
        return userDao.findAll();
    }

    @Override
    public User showUserById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(long id, User user) {
        userDao.update(id,user);
    }

    @Override
    public void delete(long id) {
        userDao.delete(showUserById(id));
    }
}
