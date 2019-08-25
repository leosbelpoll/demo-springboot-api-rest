package com.leito.demoapirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("hello")
    public String hello(){
        return "Hello ...";
    }

    @GetMapping("hello-bean")
    public HelloBean helloBean(){
        return new HelloBean(1, "Test");
    }

}
