package com.kagency.kagencyapi.services;

import com.kagency.kagencyapi.entities.User;
import com.kagency.kagencyapi.exceptions.KAuthException;
import com.kagency.kagencyapi.repositories.UserRepository;
import com.kagency.kagencyapi.repositories.UserRepositoryImpl;
import com.kagency.kagencyapi.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepositoryImpl userRepositoryImpl;

    @Override
    public User inValidUser(String email, String password) throws KAuthException {
        return null;
    }

    @Override
    public List<User> getAllUser() throws KAuthException {
        Iterable<User> rs = userRepositoryImpl.findAll();
        List<User> users = new ArrayList<>();
        rs.forEach( users::add);
        return users;
    }


    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws KAuthException {
        if (email != null) email = email.toLowerCase();
        boolean validEmail = StringUtils.validEmail(email);
        if (!validEmail) throw new KAuthException("Invalid email format");
        List<User> listUser = userRepositoryImpl.findByEmail(email);
        if (listUser.size() > 0) throw new KAuthException("Email already in use");
        User newUser = new User(firstName, lastName, email, password);
        return userRepositoryImpl.create(newUser);
    }
}
