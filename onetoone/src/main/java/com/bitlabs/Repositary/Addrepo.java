package com.bitlabs.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.entity.Address;

public interface Addrepo extends JpaRepository<Address, Integer> {

}
