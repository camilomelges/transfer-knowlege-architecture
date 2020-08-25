package com.neuroteks.transferknowlegearchitecture.domain.services;

import com.neuroteks.transferknowlegearchitecture.repository.UserRepository;
import com.neuroteks.transferknowlegearchitecture.repository.entities.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class InsertUserServiceTest {

    @InjectMocks
    private InsertUserService insertUserService;

    @Mock
    private UserRepository userRepository;

    private final static String email = "teste@teste.com";

    private User createUser() {
        User user = new User();
        user.setEmail(email);
        user.setPassword("teste");
        return user;
    }

    @Test
    void shouldBeCallSave() {
        insertUserService.save(createUser());
        Mockito.verify(userRepository, Mockito.times(1)).save(Mockito.any(User.class));
    }

    @Test
    void shouldBeCallFindByEmail() {
        insertUserService.findByEmail(email);
        Mockito.verify(userRepository, Mockito.times(1)).findByEmail(email);
    }
}