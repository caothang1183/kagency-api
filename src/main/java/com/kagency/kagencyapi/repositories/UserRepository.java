package com.kagency.kagencyapi.repositories;

import com.kagency.kagencyapi.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository {

//    final String SQL_FIND_BY_EMAIL = "SELECT COUNT(*) FROM k_user WHERE EMAIL = ?1";
//    final String SQL_FIND_BY_UUID = "SELECT * FROM k_user WHERE uuid = ?1";
//    final String SQL_DELETE_BY_UUID = "DELETE FROM k_user WHERE uuid = ?1";
//
//    @Query(value = SQL_FIND_BY_EMAIL, nativeQuery = true)
    List<User> findAll();

    List<User> findByEmail(String email);

    User create (User user);

}
