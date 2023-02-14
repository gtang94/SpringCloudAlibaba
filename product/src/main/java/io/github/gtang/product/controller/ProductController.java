package io.github.gtang.product.controller;

import com.alibaba.fastjson.JSON;
import io.github.gtang.product.service.ProductService;
import io.github.gtang.common.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {

    @Value("${server.port}")
    String port;

    @Autowired
    private ProductService productService;

    @RequestMapping("/show/{pid}")
    public Product show(@PathVariable("pid") Integer pid) {

        log.info("调用Product服务，服务端口号: {}", port);

        Product product = productService.findByPid(pid);

        log.info("查询到商品: {}", JSON.toJSONString(product));

        return product;
    }
}
