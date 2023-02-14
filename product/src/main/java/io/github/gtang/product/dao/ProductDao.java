package io.github.gtang.product.dao;

import io.github.gtang.common.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
