package com.actibody.api.repository;

import com.actibody.api.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<Users,Long> {
        Users findByUserId(String user_id);
}
