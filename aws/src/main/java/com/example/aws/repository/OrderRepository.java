package com.example.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aws.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

}
