package org.springboot.riwi.chronoturner.backend.Repository;

import org.springboot.riwi.chronoturner.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByEmail(String email);
}
