package com.bitlabs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bitlabs.Enitiy.Company;
import com.bitlabs.Repositary.Companyrepo;

@SpringBootApplication
public class Springdatajpapng2Application implements CommandLineRunner {
@Autowired
	public Companyrepo crp;
	public static void main(String[] args) {
		SpringApplication.run(Springdatajpapng2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Company c = new Company();
		c.setName("Amazon");
		c.setSalary(35000);
		Company c1 = new Company();
		c1.setName("Flipkart");
		c1.setSalary(45000);
		crp.saveAll(List.of(c,c1));
		Company sav=crp.findById(c.getId()).get();
		System.out.println(sav);*/
		/*List<Company> s=crp.findAll();
		s.forEach((p)->{
			System.out.println(p.getName());
			System.out.println(p.getSalary());
		});*/
		Company c = new Company();
		System.out.println(crp.count());
	}

}
