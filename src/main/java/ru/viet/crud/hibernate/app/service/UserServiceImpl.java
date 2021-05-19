package ru.viet.crud.hibernate.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.viet.crud.hibernate.app.dao.UserDao;
import ru.viet.crud.hibernate.app.model.User;

import java.sql.SQLException;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void add(User user) throws SQLException  {
        userDao.add(user);
    }

    @Override
    @Transactional
    public List<User> index()throws SQLException  {
        return userDao.index();
    }

    @Override
    @Transactional
    public User showUser(int id)throws SQLException  {
        return userDao.showUser(id);
    }

    @Override
    @Transactional
    public void update(User updatedUser)throws SQLException  {
        userDao.update(updatedUser);
    }

    @Override
    @Transactional
    public void delete(int id)throws SQLException {
        userDao.delete(id);
    }
}
