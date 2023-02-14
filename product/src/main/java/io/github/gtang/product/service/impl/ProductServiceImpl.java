package io.github.gtang.product.service.impl;

import io.github.gtang.product.dao.ProductDao;
import io.github.gtang.product.service.ProductService;
import io.github.gtang.common.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product findByPid(Integer pid) {
        return productDao.findById(pid).get();
    }
}
