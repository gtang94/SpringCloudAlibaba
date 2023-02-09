package io.github.gtang.order.feign;

import io.github.gtang.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-service", path = "/stock", configuration = FeignConfig.class)
public interface StockFeignInterface {

    @RequestMapping("reduce/{id}")
    String reduce(@PathVariable("id") Long id);
}
