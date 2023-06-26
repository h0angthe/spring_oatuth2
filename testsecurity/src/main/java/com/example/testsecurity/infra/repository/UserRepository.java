package com.example.testsecurity.infra.repository;

import com.example.testsecurity.infra.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{email: '?0'}")
    public List<User> findByEmail(String email);
}
