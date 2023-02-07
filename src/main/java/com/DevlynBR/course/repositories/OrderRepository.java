package com.DevlynBR.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevlynBR.course.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long>{

}
