package io.github.gtang.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    String port;

    @RequestMapping("show/{id}")
    public String show(@PathVariable Integer id) {
        System.out.println("Product Port: " + port);
        return "查询商品(" + id + ")";
    }
}
