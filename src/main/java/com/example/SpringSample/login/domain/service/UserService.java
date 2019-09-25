package com.example.SpringSample.login.domain.service;

import com.example.SpringSample.login.domain.model.User;
import com.example.SpringSample.login.domain.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserService {
    @Autowired
    @Qualifier("UserDaoJdbcImpl4")
    UserDao dao;

    public boolean insert(User user) {
        int rowNumber = dao.insertOne(user);
        boolean result = false;

        if (rowNumber > 0) {
            result = true;
        }
        return result;
    }

    public int count() {
        return dao.count();
    }

    public List<User> selectMany() {
        return dao.selectMany();
    }

    public User selectOne(String userId) {
        return dao.selectOne(userId);
    }

    public boolean updateOne(User user) {
        boolean result = false;
        int rowNumber = dao.updateOne(user);

        if (rowNumber > 0) {
            result = true;
        }
        return result;
    }

    public boolean deleteOne(String userId) {
        int rowNumber = dao.deleteOne(userId);
        boolean result = false;

        if (rowNumber > 0) {
            result = true;
        }
        return result;
    }
}
