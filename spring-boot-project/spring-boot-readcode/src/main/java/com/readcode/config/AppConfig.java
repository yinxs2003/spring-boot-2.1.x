package com.readcode.config;

import com.readcode.entity.AppEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public AppEntity getAppEntity(){
		return new AppEntity("app", "app describe");
	}
}
