package com.neuroteks.transferknowlegearchitecture.domain.services;

import com.neuroteks.transferknowlegearchitecture.repository.UserRepository;
import com.neuroteks.transferknowlegearchitecture.repository.entities.User;
import org.springframework.stereotype.Service;

@Service
public class InsertUserService implements IInsertUserService {

    private final UserRepository userRepository;

    public InsertUserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
