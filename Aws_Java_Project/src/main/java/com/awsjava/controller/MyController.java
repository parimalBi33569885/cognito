package com.awsjava.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{

	@GetMapping("/name/{name}")
	public ResponseEntity<String> mymethod(@PathVariable("name") String name)
	{
		return new ResponseEntity<String>(name, HttpStatus.OK);
	}

}
