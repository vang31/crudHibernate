package ru.viet.crud.hibernate.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.viet.crud.hibernate.app.model.User;

import java.util.List;


@Repository
public class UserDaoImpl implements  UserDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<User> index() {
        return jdbcTemplate.query("SELECT * FROM Users", new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public User showUser(int id) {
        return jdbcTemplate.query("SELECT * FROM Users WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(User.class))
                .stream().findAny().orElse(null);
    }

    @Override
    public void add(User user) {
        jdbcTemplate.update("INSERT INTO Users (name, age, last_name)" +
                " VALUES (?,?,?)", user.getName(), user.getAge(), user.getLastName());
    }

    @Override
    public void update(int id, User updatedUser) {
        jdbcTemplate.update("UPDATE Users SET name=?, last_name=?, age=? WHERE id=?",
                updatedUser.getName(), updatedUser.getLastName(), updatedUser.getAge(), id);
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM Users WHERE id=?", id);
    }
}
