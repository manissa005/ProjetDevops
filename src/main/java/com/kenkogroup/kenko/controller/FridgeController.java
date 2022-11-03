package com.kenkogroup.kenko.controller;

import com.kenkogroup.kenko.entity.Fridge;
import com.kenkogroup.kenko.service.FridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FridgeController {
   @Autowired
   private FridgeService service;

   @PostMapping("/addFridge")
   public Fridge addFridge(@RequestBody Fridge fridge){
       return service.saveFridge(fridge);
   }

    @PostMapping("/addFridges")
    public List<Fridge> addFridges(@RequestBody List<Fridge> fridges){
        return service.saveFridges(fridges);
    }

    @GetMapping("/Fridges")
    public List<Fridge> findAllFridges(){
       return service.getFridges();
    }
    @GetMapping("/Fridge/{id}")
    public Fridge findFridgeById(@PathVariable int id){
       return service.getFridgeById(id);
    }
    @GetMapping("/Fridge/{userId}")
    public Fridge findFridgeByUserId(@PathVariable int userId){
        return service.getFridgeById(userId);
    }

    @PutMapping ("/update")
    public Fridge updateFridge(@RequestBody Fridge fridge){
        return service.updateFridge(fridge);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteFridge(@PathVariable int id){
       return service.deleteFridge(id);
    }



}
