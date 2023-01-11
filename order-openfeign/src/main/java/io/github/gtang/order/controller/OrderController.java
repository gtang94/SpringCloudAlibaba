package io.github.gtang.order.controller;

import io.github.gtang.order.feign.ProductFeignService;
import io.github.gtang.order.feign.StockFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private StockFeignService stockFeignService;

    @Resource
    private ProductFeignService productFeignService;

    @RequestMapping("/add")
    public String add() {
        System.err.println("下单成功");
        String msg = stockFeignService.reduce();
        return "hello word" + msg;
    }

    @RequestMapping("/get")
    public String get() {
        System.out.println("查询成功");
        String msg = productFeignService.get(1);
        return "hello open feign: " + msg;
    }
}
