package com.microservices.os.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.os.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
