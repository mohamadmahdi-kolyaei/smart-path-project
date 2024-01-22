package com.example.smartpath.controller;

import com.example.smartpath.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FibonacciController {
    @Autowired
    private FibonacciService fibonacciService;

    @GetMapping("/fibonacci/{n}")
    public String getFibonacci(@PathVariable int n) {
        return fibonacciService.getFibonacciSentence(n);
    }
}
