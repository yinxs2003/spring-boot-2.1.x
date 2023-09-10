package org.springframework.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.entity.MyStarterEntity;
import org.springframework.boot.service.MyStarterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyStarterAutoConfiguration {
	@Autowired
	private MyStarterEntity myStarterEntity;

	@Bean
	public MyStarterService myStarterService() {
		return new MyStarterService(myStarterEntity);
	}

	@Bean
	public MyStarterEntity getEntity() {
		MyStarterEntity start = new MyStarterEntity();
		start.setName("start");
		start.setAge("19");
		return start;
	}
}