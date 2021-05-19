package ru.viet.crud.hibernate.app.service;

import ru.viet.crud.hibernate.app.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {

    //add-create
    void add(User user) throws SQLException;

    //read
    List<User> index() throws SQLException;

    User showUser(int id) throws SQLException;

    //update
    void update(User updatedUser) throws SQLException;

    //delete
    void delete(int id) throws SQLException;
}
