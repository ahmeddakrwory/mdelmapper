package com.test.modelmap;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMaoperConfig {
	@Bean
 public ModelMapper mapper() {
	 return new ModelMapper();
 }
}
