package com.restoox.service;

import com.restoox.model.Order;
import com.restoox.model.User;
import com.restoox.request.OrderRequest;

import java.util.List;

public interface OrderService {
    public Order createOrder(OrderRequest order, User user) throws Exception;
    public Order updateOrder(Long orderId, String orderStatus)throws Exception;
    public void  cancelOrder(Long orderId)throws Exception;
    public List<Order> getUserOrder(Long userId)throws Exception;
    public List<Order> getRestaurantOrder(Long restaurantId,String orderStatus)throws Exception;
    public Order findOrderById(Long orderId) throws  Exception;
}
