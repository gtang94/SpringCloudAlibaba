package io.github.gtang.stock.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/reduce")
    public String reduce() {
        System.err.println("扣减库存");
        return "扣减库存";
    }
}
