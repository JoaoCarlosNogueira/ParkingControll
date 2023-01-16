package com.joaocarlos.ParkingControll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ParkingControllApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControllApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("senha123"));
	}

}
