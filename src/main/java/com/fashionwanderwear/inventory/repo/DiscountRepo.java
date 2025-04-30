package com.example.itpm.discount_promotions.repo;

import com.example.itpm.discount_promotions.entity.Discount;
import org.springframework.data.jpa.repo.JpaRepo;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface DiscountRepo extends JpaRepository<Discount, Integer> {
    List<Discount> findAllByActiveEquals(boolean activeState);
}