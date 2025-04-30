package com.example.itpm.discount_promotions.service.impl;

import com.example.itpm.discount_promotions.dto.DiscountDTO;
import com.example.itpm.discount_promotions.entity.Discount;
import com.example.itpm.discount_promotions.repo.DiscountRepo;
import com.example.itpm.discount_promotions.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class DiscountServiceIMPL implements DiscountService {

    @Autowired
    private DiscountRepo discountRepo;

    @Override
    public String saveDiscount(DiscountDTO discountDTO) {
        Discount discount = new Discount(
                discountDTO.getId(),
                discountDTO.getItemId(),
                discountDTO.getTitle(),
                discountDTO.getRate(),
                discountDTO.getPeriodStart(),
                discountDTO.getPeriodEnd(),
                discountDTO.getConditions(),
                discountDTO.getDescription(),
                discountDTO.getFinalPrice(),
                discountDTO.getActualPrice(),
                discountDTO.isActive()
        );
        discount.setCreatedAt(LocalDateTime.now());
        discountRepo.save(discount);
        return discountDTO.getTitle() + " saved successfully";
    }

    @Override
    public String updateDiscount(DiscountDTO discountDTO) {
        if(discountRepo.existsById(discountDTO.getId())) {
            Discount discount = discountRepo.getReferenceById(discountDTO.getId());

            // Update all fields except createdAt
            discount.setItemId(discountDTO.getItemId());
            discount.setTitle(discountDTO.getTitle());
            discount.setRate(discountDTO.getRate());
            discount.setPeriodStart(discountDTO.getPeriodStart());
            discount.setPeriodEnd(discountDTO.getPeriodEnd());
            discount.setConditions(discountDTO.getConditions());
            discount.setDescription(discountDTO.getDescription());
            discount.setFinalPrice(discountDTO.getFinalPrice());
            discount.setActualPrice(discountDTO.getActualPrice());
            discount.setActive(discountDTO.isActive());
            discount.setUpdatedAt(LocalDateTime.now());

            discountRepo.save(discount);
            return discountDTO.getTitle() + " updated successfully";
        } else {
            throw new RuntimeException("No discount found with ID: " + discountDTO.getId());
        }
    }

    @Override
    public DiscountDTO getDiscountById(int discountId) {
        if(discountRepo.existsById(discountId)) {
            Discount discount = discountRepo.getReferenceById(discountId);
            return new DiscountDTO(
                    discount.getId(),
                    discount.getItemId(),
                    discount.getTitle(),
                    discount.getRate(),
                    discount.getPeriodStart(),
                    discount.getPeriodEnd(),
                    discount.getConditions(),
                    discount.getDescription(),
                    discount.getFinalPrice(),
                    discount.getActualPrice(),
                    discount.isActive()
            );
        } else {
            throw new RuntimeException("No discount found with ID: " + discountId);
        }
    }

    @Override
    public List<DiscountDTO> getAllDiscounts() {
        List<Discount> allDiscounts = discountRepo.findAll();
        List<DiscountDTO> discountDTOList = new ArrayList<>();

        if(!allDiscounts.isEmpty()) {
            for(Discount discount : allDiscounts) {
                discountDTOList.add(new DiscountDTO(
                        discount.getId(),
                        discount.getItemId(),
                        discount.getTitle(),
                        discount.getRate(),
                        discount.getPeriodStart(),
                        discount.getPeriodEnd(),
                        discount.getConditions(),
                        discount.getDescription(),
                        discount.getFinalPrice(),
                        discount.getActualPrice(),
                        discount.isActive()
                ));
            }
            return discountDTOList;
        } else {
            throw new RuntimeException("No discounts found");
        }
    }

    @Override
    public String deleteDiscount(int discountId) {
        if(discountRepo.existsById(discountId)) {
            discountRepo.deleteById(discountId);
            return "Discount with ID: " + discountId + " deleted successfully";
        } else {
            throw new RuntimeException("No discount found with ID: " + discountId);
        }
    }

    @Override
    public List<DiscountDTO> getAllDiscountsByActiveState(boolean activeState) {
        List<Discount> activeDiscounts = discountRepo.findAllByActiveEquals(activeState);
        List<DiscountDTO> discountDTOList = new ArrayList<>();

        if(!activeDiscounts.isEmpty()) {
            for(Discount discount : activeDiscounts) {
                discountDTOList.add(new DiscountDTO(
                        discount.getId(),
                        discount.getItemId(),
                        discount.getTitle(),
                        discount.getRate(),
                        discount.getPeriodStart(),
                        discount.getPeriodEnd(),
                        discount.getConditions(),
                        discount.getDescription(),
                        discount.getFinalPrice(),
                        discount.getActualPrice(),
                        discount.isActive()
                ));
            }
            return discountDTOList;
        } else {
            throw new RuntimeException("No " + (activeState ? "active" : "inactive") + " discounts found");
        }
    }
}