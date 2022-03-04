package org.springboot.service;


import org.springboot.model.User;
import org.springboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public User showUserById(long id) {
        return userDao.showUserById(id);
    }

    public void save(User user){
        userDao.save(user);
    }

    @Override
    public void update(long id, User user) {
        userDao.update(id,user);
    }

    public void delete(long id){
        userDao.delete(id);
    }
}
