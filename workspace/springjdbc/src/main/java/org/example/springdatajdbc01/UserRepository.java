package org.example.springdatajdbc01;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long>,CustomUserRepository {
//    User findByName(String name);

    List<User> findByName(String name);
}
