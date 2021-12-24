package com.techwasti.cicdheroku.demo.sbgithubcicd;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {
    
    @GetMapping("/hello")
    String helloWorld(){

        return "Helloworld, Welcome to github cicd action with heroku demo!";
        
    }
}
