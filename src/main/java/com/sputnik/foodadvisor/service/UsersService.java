package com.sputnik.foodadvisor.service;

import com.sputnik.foodadvisor.db.model.User;
import com.sputnik.foodadvisor.db.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsersService {

  private final UserRepository userRepository;

  public User save(User user) {
    return userRepository.save(user);
  }
}
