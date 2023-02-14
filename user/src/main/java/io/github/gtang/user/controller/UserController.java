package io.github.gtang.user.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class UserController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/reduce/{id}")
    public String reduce(@PathVariable("id")Long id) {
        System.out.println("Stock Port: " + port);
        return "扣减库存(" + id + ")";
    }
}
