package com.bitlabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.bitlabs.Entity.Student;
import com.bitlabs.Repositary.Studentrepositary;

@SpringBootApplication
public class Springdatajpapng1Application implements CommandLineRunner{
@Autowired
	private Studentrepositary sturpo;
	
	public static void main(String[] args) {
		SpringApplication.run(Springdatajpapng1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s=new Student();
		s.setId(1);
		s.setName("bangalore");
		s.setAge(23);
		sturpo.save(s);
		// TODO Auto-generated method stub
		Student sav=sturpo.findById(s.getId()).get();
		System.out.println(sav);
	}

}
