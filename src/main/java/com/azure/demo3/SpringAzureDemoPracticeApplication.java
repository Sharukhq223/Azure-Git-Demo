package com.azure.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoPracticeApplication {
	@GetMapping("/mwssage")
	public String message(){
		return "hello!! your application is deployed succesfully";
	}

//	echo "# Azure-Git-Demo" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Sharukhq223/Azure-Git-Demo.git
//	git push -u origin main


	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoPracticeApplication.class, args);
	}

}
