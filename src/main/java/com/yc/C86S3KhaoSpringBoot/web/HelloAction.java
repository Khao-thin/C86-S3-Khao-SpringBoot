package com.yc.C86S3KhaoSpringBoot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAction {
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	@GetMapping("/hello1")
	public String hello1() {
		return "hello 夏可浩";
	}

}
