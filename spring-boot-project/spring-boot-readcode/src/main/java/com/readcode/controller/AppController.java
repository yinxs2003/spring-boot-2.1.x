package com.readcode.controller;

import com.readcode.entity.AppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URL;


@Controller
public class AppController {

	@Autowired
	private AppEntity appEntity;

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
}
