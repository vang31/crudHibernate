package ru.viet.crud.hibernate.app.dao;

import ru.viet.crud.hibernate.app.model.User;

import java.util.List;

public interface UserDao {

    //add-create
    void add(User user);

    //read
    List<User> index();

    User showUser(int id);

    //update
    void update(int id, User updatedUser);

    //delete
    void delete(int id);

}
