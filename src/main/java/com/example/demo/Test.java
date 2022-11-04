package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController @RequestMapping("/test")
public class Test {

    @GetMapping
    public int[] test() {
        int[] arr = new int[] {1, 3, 4};

        return arr;
    }
}
