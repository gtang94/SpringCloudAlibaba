package io.github.gtang.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * name: 指定调用rest接口所对应的服务名
 * path: 指定调用rest接口所在的StockController指定的@RequestMapping
 */
@FeignClient(name = "stock-service", path = "/stock")
public interface StockFeignService {

    // 声明需要调用的reset接口对应的方法
    @RequestMapping("/reduce")
    String reduce();
}
