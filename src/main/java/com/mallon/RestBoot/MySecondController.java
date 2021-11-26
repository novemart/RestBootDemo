package com.mallon.RestBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecondController {

    @GetMapping("/simple")
    public String mySimpleMethod(){
        return "Hi Martina!";
    }
}
