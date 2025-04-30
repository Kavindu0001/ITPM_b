package com.fashionwanderwear.inventory.service.impl;

import com.fashionwanderwear.inventory.dto.ClothsDTO;
import com.fashionwanderwear.inventory.dto.request.ClothUpdateDTO;
import com.fashionwanderwear.inventory.entity.Cloths;
import com.fashionwanderwear.inventory.repo.ClothRepo;
import com.fashionwanderwear.inventory.service.ClothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ClothServiceIMPL implements ClothService {

    @Autowired
    private ClothRepo clothRepo;

    @Override
    public String getCloth() {
        return "";
    }

    @Override
    public String saveCloth(ClothsDTO clothsDTO) {
        Cloths cloths = new Cloths(
                clothsDTO.getClothId(),
                clothsDTO.getClothName(),
                clothsDTO.getImagePath(),
                clothsDTO.getClothPrice(),
                clothsDTO.getStockQuantity(),
                clothsDTO.getDescription(),
                clothsDTO.isActive(),
                clothsDTO.getClothColor(),
                clothsDTO.getClothSize()
        );
        clothRepo.save(cloths);
        return "saved";
    }


    @Override
    public String updateCloth(ClothUpdateDTO clothUpdateDTO) {
        if (clothRepo.existsById(clothUpdateDTO.getClothId())) {
            Cloths cloths = clothRepo.getReferenceById(clothUpdateDTO.getClothId());

            if (clothUpdateDTO.getClothName() != null && !clothUpdateDTO.getClothName().isEmpty()) {
                cloths.setClothName(clothUpdateDTO.getClothName());
            }

            if (clothUpdateDTO.getDescription() != null && !clothUpdateDTO.getDescription().isEmpty()) {
                cloths.setDescription(clothUpdateDTO.getDescription());
            }

            if (clothUpdateDTO.getClothPrice() > 0) {
                cloths.setClothPrice(clothUpdateDTO.getClothPrice());
            }

            if (clothUpdateDTO.getStockQuantity() >= 0) {
                cloths.setStockQuantity(clothUpdateDTO.getStockQuantity());
            }

            if (clothUpdateDTO.getClothColor() != null && !clothUpdateDTO.getClothColor().isEmpty()) {
                cloths.setClothColor(clothUpdateDTO.getClothColor());
            }

            if (clothUpdateDTO.getClothSize() != null && !clothUpdateDTO.getClothSize().isEmpty()) {
                cloths.setClothSize(clothUpdateDTO.getClothSize());
            }

            cloths.setActive(clothUpdateDTO.isActive());

            clothRepo.save(cloths);
            return clothUpdateDTO.getClothId() + " updated successfully";
        } else {
            throw new RuntimeException("Cloth not found with ID: " + clothUpdateDTO.getClothId());
        }
    }

    @Override
    public List<Cloths> getAllCloths() {
        return clothRepo.findAll();
    }

    @Override
    public String deleteClothById(int clothId) {
        if (clothRepo.existsById(clothId)) {
            clothRepo.deleteById(clothId);  // Deletes the cloth by clothId
            return "Cloth with ID " + clothId + " has been deleted.";
        } else {
            throw new RuntimeException("Cloth not found with ID " + clothId);
        }
    }

    @Override
    public Cloths getClothById(int clothId) {
        return null;
    }


}
