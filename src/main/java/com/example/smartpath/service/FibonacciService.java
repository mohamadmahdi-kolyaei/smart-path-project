package com.example.smartpath.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "fibonacciCache", keyGenerator = "customKeyGenerator")
public class FibonacciService {
    @Cacheable(unless = "#result.startsWith('Invalid')")
    public String getFibonacciSentence(int n) {
        if (n <= 0) {
            return "Invalid input. Please provide a positive integer.";
        }

        int fib1 = 0, fib2 = 1;
        StringBuilder result = new StringBuilder("Fibonacci Sentence: 0 1");

        for (int i = 2; i < n; i++) {
            int fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
            result.append(" ").append(fib);
        }

        return result.toString();
    }
}
