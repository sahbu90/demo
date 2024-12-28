package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1")
public class MyController {

	@GetMapping
	public ResponseEntity<?> getJSONMsg(){
		return ResponseEntity.ok("Hello World");
	}
}
