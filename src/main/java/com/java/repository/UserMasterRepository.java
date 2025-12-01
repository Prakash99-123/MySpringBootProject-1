package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.model.UserMaster;
import java.util.Optional;

public interface UserMasterRepository extends JpaRepository<UserMaster, Long> {
    Optional<UserMaster> findByUsername(String username);
    Optional<UserMaster> findByEmail(String email);
    Optional<UserMaster> findByMobile(String mobile);

    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
