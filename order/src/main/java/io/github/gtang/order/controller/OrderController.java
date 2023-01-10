package io.github.gtang.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add() {
        System.err.println("下单成功");
        String msg = restTemplate.getForObject("http://stock-service/stock/reduce", String.class);
        return "hello word" + msg;
    }
}
