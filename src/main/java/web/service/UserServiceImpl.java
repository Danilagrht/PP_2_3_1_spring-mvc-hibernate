package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
