/*package com.kenkogroup.kenko.fridgeContent.controller;
import com.kenkogroup.kenko.fridgeContent.entity.FridgeContent;
import com.kenkogroup.kenko.fridgeContent.service.FridgeContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FridgeContentController {

    @Autowired
    private FridgeContentService service;


    @PostMapping("/addFridgeContent")
    public FridgeContent addFridgeContent(@RequestBody FridgeContent fridgeContent){
        return service.saveFridgeContent(fridgeContent);
    }

    @PostMapping("/addFridgesContent")
    public List<FridgeContent> addFridgesContent(@RequestBody List<FridgeContent> fridgesContent){
        return service.saveFridgesContent(fridgesContent);
    }

    @GetMapping("/FridgesContent")
    public List<FridgeContent> findAllFridges(){
        return service.getFridgesContent();
    }

    @GetMapping("/FridgeContent/{fridgeContentId}")
    public FridgeContent findFridgeById(@PathVariable int fridgeContentId){
        return service.getFridgeContentById(fridgeContentId);
    }

    @PutMapping ("/updateContent")
    public FridgeContent updateFridgeContent(@RequestBody FridgeContent content){
        return service.updateFridgeContent(content);
    }
    @DeleteMapping("/delete/{fridgeContentId}")
    public String deleteFridgeContent(@PathVariable int fridgeContentId){
        return service.deleteFridgeContent(fridgeContentId);
    }
}
*/