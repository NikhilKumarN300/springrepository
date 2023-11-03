package com.bitlabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bitlabs.Repositary.UserProfilerepo;
import com.bitlabs.Repositary.UserRepo;
import com.bitlabs.entity.User;
import com.bitlabs.entity.UserProfile;

@SpringBootApplication
public class OnetoonebidirectionalApplication implements CommandLineRunner{
@Autowired
private UserRepo userrepo;
@Autowired
private UserProfilerepo userprrepo;
	public static void main(String[] args)  {
		SpringApplication.run(OnetoonebidirectionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u=new User();
		u.setName("Nikhil");
		u.setEmail("nikhil123@gmail.com");
		UserProfile up=new UserProfile();
		up.setPhonenumber("434343434");
		up.setAddress("bangalore");
		u.setUserpro(up);
		up.setUser(u);
		userrepo.save(up);
	}

}
