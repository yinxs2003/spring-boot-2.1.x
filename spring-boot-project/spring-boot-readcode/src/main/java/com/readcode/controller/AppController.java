package com.readcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URL;


@Controller
public class AppController {
	@RequestMapping(path = "/appGet", method = RequestMethod.GET)
	@ResponseBody
	public String appGet() {
		return "hello world";
	}
}
