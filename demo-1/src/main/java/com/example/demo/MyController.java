package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // Injecting the value of 'my.website.name'
      // property from configuration
    @Value("${my.website.name}")
    private String myWebsiteName;
    
    @Value("${env.test}")
    private String env;

    // Handling GET requests at the root path ("/")
      // and returning a welcome message
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String welcome() {
        // Constructing and returning a welcome message
          // including the injected website name
        return "Welcome to " + myWebsiteName +" :: "+env;
    }

}