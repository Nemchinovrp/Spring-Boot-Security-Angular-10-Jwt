package com.nemchinovrp.jwtauthentication.service;

import com.nemchinovrp.jwtauthentication.model.User;
import com.nemchinovrp.jwtauthentication.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
