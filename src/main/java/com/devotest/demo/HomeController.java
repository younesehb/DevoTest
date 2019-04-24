package com.devotest.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app")
public class HomeController {


   @GetMapping({"","/"})
    public String index (){
    return "Welcome to the application of and younes.";
    }

    @GetMapping("/{id}")
    public String geefId(@PathVariable int id){
        return "The given id is " + id;
    }
}
