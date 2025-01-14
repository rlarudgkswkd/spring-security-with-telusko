package com.SpringSecurityExample.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String great(HttpServletRequest request) {
        return "this is homepage " + request.getSession().getId();
    }
}
