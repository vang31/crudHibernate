package ru.viet.crud.hibernate.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.viet.crud.hibernate.app.dao.UserDao;
import ru.viet.crud.hibernate.app.model.User;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public User showUser(int id) {
        return userDao.showUser(id);
    }

    @Override
    public void update(int id, User updatedUser) {
        userDao.update(id, updatedUser);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
