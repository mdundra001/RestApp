package com.madhusudhan.restservice.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String index()
    {
        return "Hello World!, this is Madhusudhan changes";
    }

}
