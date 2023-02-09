package io.github.gtang.order.controller;

import io.github.gtang.order.feign.ProductFeignInterface;
import io.github.gtang.order.feign.StockFeignInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Value("${server.port}")
    String port;

    @Resource
    private ProductFeignInterface productFeignInterface;

    @Resource
    private StockFeignInterface stockFeignInterface;

    @RequestMapping("/add")
    public String add() {
        System.out.println("Order Port: " + port);

        Long productId = 1L;
        String productMsg = productFeignInterface.show(productId);
        String stockMsg = stockFeignInterface.reduce(productId);
        System.err.println("下单成功");
        return productMsg + " " + stockMsg;
    }
}
