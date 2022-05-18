package srl.neotech.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerAPIController {

	
	@GetMapping(value = "/customer/hello")
	public String hello() {
		return "Ciaoooo!";
	}
}
