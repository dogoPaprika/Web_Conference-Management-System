package com.cms.repositories;

import com.cms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long> {
    User getUserByUsernameAndPassword(String username, String password);
}
