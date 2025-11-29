package com.practice.Demo1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class Controller {
    @GetMapping("/message")
    public String getMessage(){
        return "i am bikash ";
    }
}
