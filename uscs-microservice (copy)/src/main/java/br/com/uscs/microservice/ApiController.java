package br.com.uscs.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@RequestMapping("/api")
	public String hello(@RequestParam String name) {
		return "Hello "+name;
	}
}