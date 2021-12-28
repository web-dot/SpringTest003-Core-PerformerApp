package com.mavenspring.SpringTest003_Core_PerformerApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.mavenspring.SpringTest003_Core_PerformerApp")
public class AppConfig {

	@Bean
	public Juggler getJuggler(@Value("${10}") int numRings) {
		return new Juggler();
	}
}
