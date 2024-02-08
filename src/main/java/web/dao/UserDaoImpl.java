package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("user1", "email1@mail.ru"));
        users.add(new User("user2", "email2@mail.ru"));
        users.add(new User("user3", "email3@mail.ru"));

        return users;
    }
}
