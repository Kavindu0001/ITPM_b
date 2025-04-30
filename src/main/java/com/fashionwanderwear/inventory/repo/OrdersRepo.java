package com.fashionwanderwear.inventory.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import springfinal.itpm.entity.Orders;

@Repository
@EnableJpaRepositories
public interface OrdersRepo extends JpaRepository<Orders, Integer> {
}
