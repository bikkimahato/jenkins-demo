package com.bikki.jenkinsDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/add")
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
        Integer c = a + b;
        return c.toString();
    }
    @GetMapping("/sub")
    public String sub(@RequestParam Integer a, @RequestParam Integer b) {
        Integer c = a - b;
        return c.toString();
    }
    @GetMapping("/mult")
    public String mult(@RequestParam Integer a, @RequestParam Integer b) {
        Integer c = a * b;
        return c.toString();
    }
}
