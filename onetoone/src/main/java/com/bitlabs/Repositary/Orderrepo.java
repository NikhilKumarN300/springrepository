package com.bitlabs.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.entity.Order;

public interface Orderrepo extends JpaRepository<Order, Integer> {

}
