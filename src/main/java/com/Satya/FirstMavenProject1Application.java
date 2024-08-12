package com.Satya;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FirstMavenProject1Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FirstMavenProject1Application.class, args);
	}
	@RestController
    public static class HelloWorldController {
        
        @GetMapping("/")
        public String hello() {
            return "Hi I am Satyabrata Dhir and I am a Software Engineer and I am working with Cognizant";
        }
    }

}
