package com.mallon.RestBoot;

import com.mallon.RestBoot.domain.MarketData;
import com.mallon.RestBoot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MyFirstController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hello")
    public String helloMethod(){
        return "hello";
    }

    @PostMapping("/hello")
    public User helloPostMethod(@RequestBody User user){
        User userSwapped = new User();
        userSwapped.setFirstName(user.getLastName());
        userSwapped.setLastName(user.getFirstName());
        return userSwapped;
    }

    @GetMapping("/marketData")
    public List<MarketData> getMarketData(){
        List<MarketData> md = restTemplate.getForObject(
                "https://exchange2.matraining.com/md", List.class);
        return md;
    }

    @GetMapping("/marketData/{ticker}")
    public MarketData getMarketDataForTicker(@PathVariable String ticker){
        MarketData md = restTemplate.getForObject(
                "https://exchange2.matraining.com/md/" + ticker, MarketData.class);
        return md;
    }

}
