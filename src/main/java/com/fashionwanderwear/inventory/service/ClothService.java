package com.fashionwanderwear.inventory.service;

import com.fashionwanderwear.inventory.dto.ClothsDTO;
import com.fashionwanderwear.inventory.dto.request.ClothUpdateDTO;
import com.fashionwanderwear.inventory.entity.Cloths;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ClothService {
    String getCloth();

    String saveCloth(ClothsDTO clothsDTO);

    String updateCloth(ClothUpdateDTO customerUpdateDTO);

    List<Cloths> getAllCloths();

    String deleteClothById(int clothId);

    Cloths getClothById(int clothId);
}
