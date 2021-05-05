package com.kagency.kagencyapi.services;

import com.kagency.kagencyapi.exceptions.KAuthException;
import com.kagency.kagencyapi.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User inValidUser(String username, String password) throws KAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws KAuthException {
        return null;
    }
}
