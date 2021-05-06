package com.kagency.kagencyapi.repositories;

import com.kagency.kagencyapi.entities.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.UUID;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private EntityManager em;

    public UserRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<User> findAll() {
        TypedQuery<User> q = em.createQuery("SELECT u FROM k_user u", User.class);
        return q.getResultList();
    }

    @Override
    public List<User> findByEmail(String email) {
        TypedQuery<User> q = em.createQuery("SELECT u FROM k_user u WHERE u.email = :email", User.class);
        q.setParameter("email", email);
        return q.getResultList();
    }

    @Override
    public User create(User user) {
        UUID uuid = UUID.randomUUID();
        TypedQuery<User> q = em.createQuery(
                "INSERT INTO k_user " +
                        "(uuid, first_name, last_name, email, password) " +
                        "VALUES (:uuid,:firstName,:lastName,:email,:password)",
                User.class);
        q.setParameter("uuid", uuid);
        q.setParameter("firstName", user.getFirstName());
        q.setParameter("lastName", user.getLastName());
        q.setParameter("email", user.getEmail());
        q.setParameter("password", user.getPassword());
        return null;
    }
}
