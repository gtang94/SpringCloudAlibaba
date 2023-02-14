package io.github.gtang.order.service;

import io.github.gtang.common.entity.Order;

public interface OrderService {

    void save(Order order);

    Order show(Integer oid);
}
