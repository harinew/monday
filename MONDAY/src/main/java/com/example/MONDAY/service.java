package com.example.MONDAY;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class service {
	@GetMapping("/home")
 public Beanc name() {
	 return new Beanc(1,"hari");
 }
	@GetMapping("/home/h")
	 public Beanc names() {
		 return new Beanc(2,"ram");
	 }
}
