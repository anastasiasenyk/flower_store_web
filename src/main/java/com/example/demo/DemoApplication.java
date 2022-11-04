package com.example.demo;

import com.example.demo.flower_properties.type.Chamomile;
import com.example.demo.flower_properties.type.Rose;
import com.example.demo.flower_properties.type.Tulip;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<String> getFlowers(){
		return List.of(
				"Hello",
				"Bye"
		);
	}
}
