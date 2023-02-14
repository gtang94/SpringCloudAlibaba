package io.github.gtang.order.feign;

import io.github.gtang.common.entity.Product;
import io.github.gtang.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-service", path = "/product", configuration = FeignConfig.class)
public interface ProductFeignInterface {

    @RequestMapping("/show/{pid}")
    Product show(@PathVariable("pid") Integer pid);
}
