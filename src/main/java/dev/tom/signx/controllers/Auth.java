package dev.tom.signx.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Auth {

    @RequestMapping("/test")
    public String hello() {
        return "hello world";
    }
}