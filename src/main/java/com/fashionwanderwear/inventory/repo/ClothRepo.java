package com.fashionwanderwear.inventory.repo;

import com.fashionwanderwear.inventory.entity.Cloths;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothRepo extends JpaRepository<Cloths, Integer> {
}
