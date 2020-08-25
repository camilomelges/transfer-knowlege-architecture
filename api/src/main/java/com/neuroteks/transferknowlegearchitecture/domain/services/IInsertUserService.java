package com.neuroteks.transferknowlegearchitecture.domain.services;

import com.neuroteks.transferknowlegearchitecture.repository.entities.User;

public interface IInsertUserService {
    User findByEmail(final String email);
    User save(User user);
}
