package com.fashionwanderwear.inventory.service.impl;

import aj.org.objectweb.asm.TypeReference;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfinal.itpm.dto.OrdersDTO;
import springfinal.itpm.entity.Orders;
import springfinal.itpm.repo.OrdersRepo;
import springfinal.itpm.service.OrdersService;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersServiceIMPL implements OrdersService {

    @Autowired
    private OrdersRepo ordersRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public String saveOrders(OrdersDTO ordersDTO) {
        Orders orders = new Orders(
                ordersDTO.getOrderId(),
                ordersDTO.getSize(),
                ordersDTO.getColor(),
                ordersDTO.getQuantity(),
                ordersDTO.getTotalPrice(),
                ordersDTO.getName(),
                ordersDTO.getAddress(),
                ordersDTO.getNumber()
        );
        ordersRepo.save(orders);
        return ordersDTO.getName();

//        Orders orders=modelMapper.map(ordersDTO, Orders.class);
//         if(!ordersRepo.existsById(orders.getOrdersId())){
//              ordersRepo.save(orders);
//              return orders.getOrdersId()+ " saved";
//         }else{
//             throw new RuntimeException("Note already exists");
//
//         }





    }

    @Override
    public List<OrdersDTO> getAllOrders() {
        List<Orders> getAllOrders =ordersRepo.findAll();
        List<OrdersDTO> allOrderDTOList=new ArrayList<>();

        if(getAllOrders.size()>0){
            for(Orders Order : getAllOrders){
                OrdersDTO OrderDTO =new OrdersDTO(
                        Order.getOrdersId(),
                        Order.getSize(),
                        Order.getColor(),
                        Order.getQuantity(),
                        Order.getTotalPrice(),
                        Order.getName(),
                        Order.getAddress(),
                        Order.getNumber()
                );
                allOrderDTOList.add(OrderDTO);
            }
            return allOrderDTOList;
        }else{
            throw new RuntimeException("No MakeOrders found");
        }
//          List<Orders> ordersList=ordersRepo.findAll();
//          if(ordersList.size()>0){
//               List<OrdersDTO> ordersDTOList=modelMapper.map(ordersList,new TypeToken<List<OrdersDTO>>(){}.getType());
//               return ordersDTOList;
//
//          }
//          else{
//              throw new RuntimeException("Orders list is empty");
//          }

    }

    @Override
    public String updateOrders(int ordersId, OrdersDTO ordersDTO) {
        if(ordersRepo.existsById(ordersId)){
            Orders orders=ordersRepo.getReferenceById(ordersId);
            orders.setSize(ordersDTO.getSize());
            orders.setColor(ordersDTO.getColor());
            orders.setQuantity(ordersDTO.getQuantity());
            orders.setTotalPrice(ordersDTO.getTotalPrice());
            orders.setName(ordersDTO.getName());
            orders.setAddress(ordersDTO.getAddress());
            orders.setNumber(ordersDTO.getNumber());
            ordersRepo.save(orders);
            return ordersDTO.getName();

        }else{
            throw new RuntimeException("Note does not exist");
        }

//        if(ordersRepo.existsById(ordersId)){
//            Orders note=modelMapper.map(ordersDTO, Orders.class);
//            ordersRepo.save(note);
//            return note.getOrdersId()+" updated";
//        }else{
//            throw new RuntimeException("Note does not exist");
//        }




    }

    @Override
    public String deleteOrders(int ordersId) {
        if(ordersRepo.existsById(ordersId)){
            ordersRepo.deleteById(ordersId);
            return ordersId + " deleted";
        }else{
            throw new RuntimeException("No MakeOrder found");
        }

    }
}
