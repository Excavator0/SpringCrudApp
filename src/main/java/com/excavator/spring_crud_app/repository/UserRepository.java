package com.excavator.spring_crud_app.repository;

import com.excavator.spring_crud_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
