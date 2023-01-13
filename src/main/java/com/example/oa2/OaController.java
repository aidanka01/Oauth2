package com.example.oa2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
@RestController
@RequestMapping("/api")
public class OaController {

    @GetMapping("/")
    public String mainPage() {
        return "Welcome to our site!";
    }

    @GetMapping("/log")
    public Principal log(Principal principal) {
        return principal;
    }

}
