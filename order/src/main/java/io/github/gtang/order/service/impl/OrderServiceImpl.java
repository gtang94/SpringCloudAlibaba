package io.github.gtang.order.service.impl;

import io.github.gtang.common.entity.Order;
import io.github.gtang.order.dao.OrderDao;
import io.github.gtang.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void save(Order order) {
        orderDao.save(order);
    }

    @Override
    public Order show(Integer oid) {
        return orderDao.findById(oid).get();
    }
}
