package io.github.gtang.order.controller;

import io.github.gtang.common.entity.Order;
import io.github.gtang.common.entity.Product;
import io.github.gtang.order.feign.ProductFeignInterface;
import io.github.gtang.order.feign.StockFeignInterface;
import io.github.gtang.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Value("${server.port}")
    String port;

    @Resource
    private ProductFeignInterface productFeignInterface;

    @Resource
    private StockFeignInterface stockFeignInterface;

    @Autowired
    private OrderService orderService;

    @RequestMapping("/add/{pid}")
    public Order add(@PathVariable("pid") Integer pid) {
        log.info("调用Order服务, 服务端口: {}", port);

        Product product = productFeignInterface.show(pid);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Order order = new Order();
        order.setUsername("测试用户");
        order.setPid(product.getPid());
        order.setUid(1);
//        orderService.save(order);

        return order;
    }

    @RequestMapping("/show/{oid}")
    public Order show(@PathVariable("oid") Integer oid) {
        log.info("调用Order服务, 服务端口: {}", port);

        Order order = orderService.show(oid);

        return order;
    }
}
