package com.fashionwanderwear.inventory.controller;

import com.fashionwanderwear.inventory.dto.ClothsDTO;
import com.fashionwanderwear.inventory.dto.request.ClothUpdateDTO;
import com.fashionwanderwear.inventory.entity.Cloths;
import com.fashionwanderwear.inventory.service.ClothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.MediaType;
import java.util.List;

@RestController
@RequestMapping("api/v1/cloths")
@CrossOrigin
public class ClothController {

    //DI
    @Autowired
    private ClothService clothService;

    @PostMapping("/save")
    public String saveCloth(@RequestBody ClothsDTO clothsDTO) {
        clothService.saveCloth(clothsDTO);
        return "saved";
    }

    @GetMapping("/all")
    public List<Cloths> getAllCloths() {
        return clothService.getAllCloths();
    }

    @PutMapping("/update/{clothId}")
    public String updateCloth(@PathVariable int clothId, @RequestBody ClothUpdateDTO clothUpdateDTO) {
        System.out.println("Update Request Received for ID: " + clothId);
        System.out.println("Data: " + clothUpdateDTO);
        clothUpdateDTO.setClothId(clothId);
        return clothService.updateCloth(clothUpdateDTO);
    }

    @DeleteMapping("/delete/{clothId}")
    public String deleteCloth(@PathVariable int clothId) {
        return clothService.deleteClothById(clothId);
    }

    @GetMapping("/{clothId}")
    public Cloths getClothById(@PathVariable int clothId) {
        return clothService.getClothById(clothId);
    }


}
