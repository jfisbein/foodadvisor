package com.sputnik.foodadvisor.db.repository;

import com.sputnik.foodadvisor.db.model.User;
import java.util.Optional;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

  Optional<User> findByNameIgnoreCase(String name);
}
