package com.ahmed.secoopecproductnetwork;

import com.ahmed.secoopecproductnetwork.role.Role;
import com.ahmed.secoopecproductnetwork.role.RoleRepository;
import com.ahmed.secoopecproductnetwork.user.User;
import com.ahmed.secoopecproductnetwork.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.Date;
import java.util.List;
@EnableWebMvc
@EnableAsync
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class SecoopecproductnetworkApplication {

	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();

		// Print the current date and time with time zone
		System.out.println("Current Date and Time with Time Zone: " + now);
		SpringApplication.run(SecoopecproductnetworkApplication.class, args);


	}

	@Bean
	public CommandLineRunner runner(RoleRepository roleRepository ) {
		return args -> {
		if (roleRepository.findByName("USER").isEmpty()) {
				roleRepository.save(Role.builder().name("USER").build());
			}
		};};}
