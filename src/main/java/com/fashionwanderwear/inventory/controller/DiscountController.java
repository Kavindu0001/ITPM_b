package com.example.itpm.discount_promotions.controller;

import com.example.itpm.discount_promotions.dto.DiscountDTO;
import com.example.itpm.discount_promotions.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/discount")
@CrossOrigin
public class DiscountController {

    @Autowired
    private DiscountService discountService;

    @PostMapping(path = "/save")
    public String saveDiscount(@RequestBody DiscountDTO discountDTO) {
        return discountService.saveDiscount(discountDTO);
    }

    @PutMapping(path = "/update/{id}")
    public String updateDiscount(@PathVariable(value = "id") int discountId,
                                 @RequestBody DiscountDTO discountDTO) {
        discountDTO.setId(discountId); // Ensure the ID from path is set in DTO
        return discountService.updateDiscount(discountDTO);
    }

    @GetMapping(path = "/get-by-id/{id}")
    public DiscountDTO getDiscountById(@PathVariable(value = "id") int discountId) {
        return discountService.getDiscountById(discountId);
    }

    @GetMapping(path = "/get-all-discounts")
    public List<DiscountDTO> getAllDiscounts() {
        return discountService.getAllDiscounts();
    }

    @DeleteMapping(path = "/delete-discount/{id}")
    public String deleteDiscount(@PathVariable(value = "id") int discountId) {
        return discountService.deleteDiscount(discountId);
    }

    @GetMapping(path = "/get-all-discounts-by-active-state/{status}")
    public List<DiscountDTO> getAllDiscountsByActiveState(
            @PathVariable(value = "status") boolean activeState) {
        return discountService.getAllDiscountsByActiveState(activeState);
    }
}