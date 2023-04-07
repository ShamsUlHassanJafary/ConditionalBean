package com.example.conditionalbean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.example.conditionalbean.model.Greeting;

@SpringBootTest
@TestPropertySource(properties = "app.language=english")
class ConditionalbeanApplicationTests {

	@Autowired
	private Greeting greetingService;

	@Test
	void contextLoads() {
		assertEquals("Hello", greetingService.greeting());
	}

}
