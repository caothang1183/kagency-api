package com.kagency.kagencyapi.repositories;

import com.kagency.kagencyapi.exceptions.KAuthException;
import com.kagency.kagencyapi.models.User;

public interface UserRepository {
    Integer create(String firstName, String lastName, String email, String password) throws KAuthException;

    User signInUser(String email, String password) throws KAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
