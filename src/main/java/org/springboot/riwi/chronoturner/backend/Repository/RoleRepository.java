package org.springboot.riwi.chronoturner.backend.Repository;

import org.springboot.riwi.chronoturner.backend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(String role);
}
