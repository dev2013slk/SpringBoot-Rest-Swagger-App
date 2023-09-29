package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Swagger3WelcomeRestController")
@RestController
@RequestMapping("/")
public class MainController {

    @ApiOperation(value = "Get Welcome Message For The Given Name ", response = String.class, tags = "getWelcomeNote")
    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable("name") String name) {
        return name+", Welcome..!!";
    }
}
