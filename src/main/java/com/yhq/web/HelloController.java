package com.yhq.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("ni hello ");
		return "ni hello ";
	}
}
