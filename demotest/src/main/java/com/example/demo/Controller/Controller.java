package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@RequestMapping("/")
	public String Hello() {
		return "Start with CI CD";
	}
	
}
