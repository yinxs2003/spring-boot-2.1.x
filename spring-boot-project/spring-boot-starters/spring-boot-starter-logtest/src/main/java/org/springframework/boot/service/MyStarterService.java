package org.springframework.boot.service;


import org.springframework.boot.entity.MyStarterEntity;

public class MyStarterService {
	private final MyStarterEntity myStarterEntity;

	public MyStarterService(MyStarterEntity myStarterEntity) {
		this.myStarterEntity = myStarterEntity;
	}

	public MyStarterEntity printInfo() {
		return myStarterEntity;
	}
}
