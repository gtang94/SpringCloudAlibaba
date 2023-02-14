package io.github.gtang.order.dao;

import io.github.gtang.common.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order, Integer> {
}
