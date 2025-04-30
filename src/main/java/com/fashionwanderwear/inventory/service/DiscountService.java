package com.example.itpm.discount_promotions.service;

import com.example.itpm.discount_promotions.dto.DiscountDTO;
import java.util.List;

public interface DiscountService {
    String saveDiscount(DiscountDTO discountDTO);
    String updateDiscount(DiscountDTO discountDTO); // Implementation will use the ID from DTO
    DiscountDTO getDiscountById(int discountId);
    List<DiscountDTO> getAllDiscounts();
    String deleteDiscount(int discountId);
    List<DiscountDTO> getAllDiscountsByActiveState(boolean activeState);
}