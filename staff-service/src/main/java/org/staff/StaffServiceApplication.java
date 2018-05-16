package org.staff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StaffServiceApplication extends StaffDaoApplication{

	public static void main(String[] args) {
		SpringApplication.run(StaffServiceApplication.class, args);
	}
}
