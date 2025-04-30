package com.example.itpm.discount_promotions.repository;

import com.example.itpm.discount_promotions.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface DiscountRepository extends JpaRepository<Discount, Integer> {
    List<Discount> findAllByActiveEquals(boolean activeState);
}