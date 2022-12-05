package com.DevlynBR.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevlynBR.course.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
