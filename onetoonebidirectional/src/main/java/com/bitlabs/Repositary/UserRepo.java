package com.bitlabs.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.entity.UserProfile;



public interface UserRepo extends JpaRepository<UserProfile, Integer> {

}
