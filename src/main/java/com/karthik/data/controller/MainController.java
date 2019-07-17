package com.karthik.data.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/jenkin")
	public String HelloJenkins() {
		return "SpringBoot Application integration to jenkins";
	}
}
