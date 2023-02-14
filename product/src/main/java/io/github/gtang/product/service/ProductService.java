package io.github.gtang.product.service;

import io.github.gtang.common.entity.Product;

public interface ProductService {

    Product findByPid(Integer pid);
}
