package com.techprimers.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/rest/server/greeting")
public class GreetingController {
	@GetMapping("/{greet}")
	public String respond(@PathVariable String greet) {
		return "Welcome and " + greet + " to you!";
	}
}
