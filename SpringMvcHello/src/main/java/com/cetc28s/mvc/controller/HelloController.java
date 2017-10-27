package com.cetc28s.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	private final static Logger log = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping(value = "/sayhello/{name}", method = RequestMethod.GET, produces = "application/json;charset=UTF8")
	@ResponseBody
	public String sayHello(@PathVariable(value = "name") String name)
	{
		log.info("hello, {}", name);
		return "{hello: " + name + "}";
	}
}
