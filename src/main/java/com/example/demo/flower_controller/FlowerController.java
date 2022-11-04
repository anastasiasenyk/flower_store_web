package com.example.demo.flower_controller;

import com.example.demo.flower_properties.type.Chamomile;
import com.example.demo.flower_properties.type.Rose;
import com.example.demo.flower_properties.type.Tulip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/List/Flowers")
public class FlowerController {

    @GetMapping
    public List<String> getFlowers(){
        return List.of(
                new Chamomile().toString(),
                new Rose().toString(),
                new Tulip().toString()
        );
    }
}
