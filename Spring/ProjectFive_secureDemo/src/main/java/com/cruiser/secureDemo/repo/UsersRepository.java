package com.cruiser.secureDemo.repo;

import com.cruiser.secureDemo.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsersRepository extends MongoRepository<Users, String> {

    Optional<Users> findByUsername(String username);

}
