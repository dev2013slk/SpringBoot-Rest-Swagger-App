package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Swaager 2 welcome")
@RestController
@RequestMapping("/")
public class MainController {

    @ApiOperation(value = "Get welcome message", response = String.class, tags = "Get Welcome Note")
    @GetMapping
    public String test(){
        return "Hello Lasath, Welcome!";
    }
}
