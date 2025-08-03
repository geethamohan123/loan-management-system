package com.loan_mgmt.auth_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthServiceController {
	
	
	@GetMapping("/healthcheck")
	public ResponseEntity<String> testHealthCheckEndPoint(){
		  return new ResponseEntity<>("API running successfully", HttpStatus.OK);
	}
	

}
