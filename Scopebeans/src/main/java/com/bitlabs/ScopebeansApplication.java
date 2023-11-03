package com.bitlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bitlabs.scope.Singleton;

@SpringBootApplication
public class ScopebeansApplication {

	public static void main(String[] args) {
		ApplicationContext c = SpringApplication.run(ScopebeansApplication.class, args);
		Singleton s = c.getBean(Singleton.class);
		Singleton s1 = c.getBean(Singleton.class);
		Singleton s2 = c.getBean(Singleton.class);
		Singleton s3 = c.getBean(Singleton.class);
	}

}
