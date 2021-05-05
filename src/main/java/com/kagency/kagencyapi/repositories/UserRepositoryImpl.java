package com.kagency.kagencyapi.repositories;

import com.kagency.kagencyapi.exceptions.KAuthException;
import com.kagency.kagencyapi.models.User;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public Integer create(String firstName, String lastName, String email, String password) throws KAuthException {
        return null;
    }

    @Override
    public User signInUser(String email, String password) throws KAuthException {
        return null;
    }

    @Override
    public Integer getCountByEmail(String email) {
        return null;
    }

    @Override
    public User findById(Integer userId) {
        return null;
    }
}
