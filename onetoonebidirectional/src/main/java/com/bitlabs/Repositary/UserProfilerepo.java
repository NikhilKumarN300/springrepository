package com.bitlabs.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bitlabs.entity.User;

public interface UserProfilerepo  extends JpaRepository<User, Integer> {

}
