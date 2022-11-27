/*package com.kenkogroup.kenko.fridgeContent.service;


import com.kenkogroup.kenko.fridgeContent.entity.FridgeContent;
import com.kenkogroup.kenko.fridgeContent.repository.FridgeContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FridgeContentService {

    @Autowired
    private FridgeContentRepository repository;

    public FridgeContent saveFridgeContent(FridgeContent fridgeContent){
        return  repository.save(fridgeContent);
    }

    public List<FridgeContent> saveFridgesContent(List<FridgeContent> fridgesContent){
        return  repository.saveAll(fridgesContent);
    }
    public List<FridgeContent> getFridgesContent(){
        return repository.findAll();
    }

    public FridgeContent getFridgeContentById(int fridgeContentId){
        return repository.findById(fridgeContentId).orElse(null);
    }


    public String deleteFridgeContent(int fridgeContentId){
        repository.deleteById(fridgeContentId);
        return "Fridge removed !!" +fridgeContentId;

    }

    public FridgeContent updateFridgeContent(FridgeContent fridgeContent){
        FridgeContent existingFridgeContent = repository.findById(fridgeContent.getFridgeContentId()).orElse(null);
        existingFridgeContent.setProduct("Tomate");
        existingFridgeContent.setQuantity(123);
        return repository.save(existingFridgeContent);
    }
}
*/