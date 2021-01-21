package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TrimsController {

	@GetMapping("/api")
	public String trimsApi() {
		return "2 - Test successfull!!";
	}
}
