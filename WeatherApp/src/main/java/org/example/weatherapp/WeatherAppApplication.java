package org.example.weatherapp;

import org.example.weatherapp.models.User;
import org.example.weatherapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherAppApplication implements CommandLineRunner {

	// dependencies
	private final UserService userService;

	@Autowired
	public WeatherAppApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userService.save(new User(
				"Simon",
				"Libiger",
				"Shimmyland",
				"Password",
				"simonlibiger@gmail.com"
		));
	}
}
