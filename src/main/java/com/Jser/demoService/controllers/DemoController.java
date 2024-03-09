package com.Jser.demoService.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jser.demoService.dtos.Demo;
import com.Jser.demoService.utils.DemoUtils;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping
	public ResponseEntity<?> getAllDemos(){
		List<Demo> list = DemoUtils.getDemoList();
		return ResponseEntity.status(HttpStatus.OK)
				.body(list);
	}
	
	@PostMapping
	public ResponseEntity<?> createDemo(@RequestBody Demo d){
		DemoUtils.setDemo(d);
		return ResponseEntity.status(HttpStatus.OK)
				.body("Successfully added demo");
	}

}
