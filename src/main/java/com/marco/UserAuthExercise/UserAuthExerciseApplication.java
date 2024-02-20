package com.marco.UserAuthExercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.marco.UserAuthExercise.domain")
public class UserAuthExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAuthExerciseApplication.class, args);
	}
}
