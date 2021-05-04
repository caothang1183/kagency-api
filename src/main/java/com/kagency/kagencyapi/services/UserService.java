package com.kagency.kagencyapi.services;

import com.kagency.kagencyapi.exceptions.KAuthException;
import com.kagency.kagencyapi.models.User;

public interface UserService {

    User inValidUser(String username, String password) throws KAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws KAuthException;
}
