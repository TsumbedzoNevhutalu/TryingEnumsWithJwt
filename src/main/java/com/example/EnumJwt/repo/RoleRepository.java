package com.example.EnumJwt.repo;


import com.example.EnumJwt.model.ERole;
import com.example.EnumJwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    //communicates with the database
    Optional<Role> findByName(ERole name);
}

