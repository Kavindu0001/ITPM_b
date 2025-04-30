package com.fashionwanderwear.inventory.service;

import springfinal.itpm.dto.OrdersDTO;

import java.util.List;

public interface OrdersService {
    String saveOrders(OrdersDTO ordersDTO);

    List<OrdersDTO> getAllOrders();

    String updateOrders(int ordersId, OrdersDTO ordersDTO);

    String deleteOrders(int ordersId);
}
