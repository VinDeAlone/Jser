package com.Jser.demoService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Jser.demoService.dtos.Demo;
import com.Jser.demoService.utils.DemoUtils;

@SpringBootApplication
public class DemoServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server started on port : 8032");
		
		DemoUtils.mainDemo();
		
		Demo d1 = new Demo();
		d1.setName("Vinayak Jadhav");
		d1.setAge(28);
		
		Demo d2 = new Demo();
		d2.setName("Vilas Jadhav");
		d2.setAge(60);
		
		Demo d3 = new Demo();
		d3.setName("Krishna Jadhav");
		d3.setAge(20);
		
		DemoUtils.setDemo(d1);
		DemoUtils.setDemo(d2);
		DemoUtils.setDemo(d3);
		
		DemoUtils.mainDemo();
	}

}
