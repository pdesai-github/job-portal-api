package com.pd.job_portal_api.user.repositories;

import com.pd.job_portal_api.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
