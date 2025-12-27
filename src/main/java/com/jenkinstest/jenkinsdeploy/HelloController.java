package com.jenkinstest.jenkinsdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	 @GetMapping("/hello")
	    public String hello() {
	        return "Hi Now in Jenkins and Docker file are done very successfully";
	    }
}
