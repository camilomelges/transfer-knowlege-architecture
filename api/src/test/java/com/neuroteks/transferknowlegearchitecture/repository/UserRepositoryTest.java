package com.neuroteks.transferknowlegearchitecture.repository;

import com.neuroteks.transferknowlegearchitecture.repository.entities.User;
import org.flywaydb.test.annotation.FlywayTest;
import org.flywaydb.test.junit5.FlywayTestExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@FlywayTest
@ExtendWith({SpringExtension.class})
@ExtendWith({FlywayTestExtension.class})
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
class UserRepositoryTest {

    private final static String email = "teste@teste.com";
    private final static String password = "teste";
    @Autowired
    private UserRepository userRepository;

    private User createUser() {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }

    @Test
    void shouldSaveUser() {
        User user = userRepository.save(createUser());
        assertTrue(user.getId() != null);
    }

    @Test
    void shouldSaveUserAndFindedByEmail() {
        User user = userRepository.save(createUser());
        user = userRepository.findByEmail(user.getEmail());
        assertTrue(user.getId() != null);
    }
}