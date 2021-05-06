package com.kagency.kagencyapi.services;

import com.kagency.kagencyapi.entities.User;
import com.kagency.kagencyapi.exceptions.KAuthException;

import java.util.List;

public interface UserService {
    User inValidUser(String email, String password) throws KAuthException;
    List<User> getAllUser() throws KAuthException;
    User registerUser(String firstName, String lastName, String email, String password) throws KAuthException;
}
