package com.neuroteks.transferknowlegearchitecture.repository;

import com.neuroteks.transferknowlegearchitecture.repository.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(final String email);
}
