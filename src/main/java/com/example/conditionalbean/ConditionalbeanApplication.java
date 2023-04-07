package com.example.conditionalbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;

import com.example.conditionalbean.model.Greeting;
import com.example.conditionalbean.model.GreetingInEnglish;
import com.example.conditionalbean.model.GreetingInSpenish;

@SpringBootApplication
public class ConditionalbeanApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConditionalbeanApplication.class, args);
	}

	@Bean
	@ConditionalOnExpression("'${app.language}'.equalsIgnoreCase('english')")
	public Greeting getGreetingInEnglish() {
		return new GreetingInEnglish();
	}

	@Bean
	@ConditionalOnExpression("'${app.language}'.equalsIgnoreCase('spanish')")
	public Greeting getGreetingInSpanish() {
		return new GreetingInSpenish();
	}

}
