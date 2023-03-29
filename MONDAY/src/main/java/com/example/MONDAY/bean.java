package com.example.MONDAY;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bean {
@GetMapping("/hello")
public String ok() {
	return "helloworld";
}
}
