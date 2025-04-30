package com.fashionwanderwear.inventory.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfinal.itpm.dto.OrdersDTO;
import springfinal.itpm.service.OrdersService;

import java.util.List;

@RestController
@RequestMapping("api/v1/orders")
@CrossOrigin
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @PostMapping(path = "/save")
    public String saveOrders(@RequestBody OrdersDTO ordersDTO) {
        ordersService.saveOrders(ordersDTO);
        return "save";
    }

    @GetMapping(
            path = "/get-all-orders"
    )
    public List<OrdersDTO> getAllCustomers(){

        List<OrdersDTO> allMakeOrders=ordersService.getAllOrders();
        return allMakeOrders;
    }

    @PutMapping(path = "/update/{id}")
    public String updateOrders(@PathVariable(value="id") int ordersId , @RequestBody  OrdersDTO ordersDTO) {
        String update= ordersService.updateOrders(ordersId,ordersDTO);
        return update;
    }

    @DeleteMapping(path="/delete/{id}")
    public String deleteOrders(@PathVariable(value = "id") int ordersId) {
        String delete =ordersService.deleteOrders(ordersId);
        return delete;
    }



}
