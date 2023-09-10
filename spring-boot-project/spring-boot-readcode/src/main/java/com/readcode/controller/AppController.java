package com.readcode.controller;

import com.readcode.entity.AppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.service.MyStarterService;


@Controller
public class AppController {

	@Autowired
	private AppEntity appEntity;

	@Autowired
	private MyStarterService myStartService;

	@RequestMapping(path = "/appPing", method = RequestMethod.GET)
	@ResponseBody
	public String appGet() {
		return "success";
	}

	@RequestMapping(path = "/appGetDesc", method = RequestMethod.GET)
	@ResponseBody
	public Object appGetDesc() {
		return appEntity;
	}

	@RequestMapping(path = "/info", method = RequestMethod.GET)
	@ResponseBody
	public Object appLogTest() {
		return myStartService.printInfo();
	}
}
