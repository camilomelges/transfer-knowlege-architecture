package com.neuroteks.transferknowlegearchitecture.entrypoint;

import com.neuroteks.transferknowlegearchitecture.domain.services.IInsertUserService;
import com.neuroteks.transferknowlegearchitecture.repository.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final IInsertUserService insertUserService;

    public UserController(final IInsertUserService insertUserService) {
        this.insertUserService = insertUserService;
    }

    @PostMapping
    public User post(@RequestBody final User user) {
        return this.insertUserService.save(user);
    }

    @GetMapping
    public User get(@RequestParam("email") String email) {
        return this.insertUserService.findByEmail(email);
    }
}
