package com.example.SpringFirst.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HomeController {
@RequestMapping("/check")
public String metOjhd() {
return "one";	
}

}
