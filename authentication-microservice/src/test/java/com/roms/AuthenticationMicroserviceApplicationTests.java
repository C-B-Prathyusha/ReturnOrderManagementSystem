package com.roms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.roms.auth.config.CustomUserDetailsService;

@SpringBootTest
class AuthenticationMicroserviceApplicationTests {

	@Autowired
	CustomUserDetailsService customUserDetailsService;

	@Test
	void whenUsernameIsPresent() {
		assertNotNull(customUserDetailsService.loadUserByUsername("abc"));
		assertNotNull(customUserDetailsService.loadUserByUsername("cde"));
	}

	@Test
	void whenUsernameIsNotPresent() {
		try {
			customUserDetailsService.loadUserByUsername("def");
		} catch (Exception e) {
			assertEquals("User not found with the name def", e.getMessage());
		}
	}

}
