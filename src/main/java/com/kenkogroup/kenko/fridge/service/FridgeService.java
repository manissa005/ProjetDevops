/*package com.kenkogroup.kenko.fridge.service;


import com.kenkogroup.kenko.fridge.entity.Fridge;
import com.kenkogroup.kenko.fridge.repository.FridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FridgeService {
    @Autowired
    private FridgeRepository repository;

    public Fridge saveFridge(Fridge fridge){
       return  repository.save(fridge);
    }

    public List<Fridge> saveFridges(List<Fridge> fridges){
        return  repository.saveAll(fridges);
    }
    public List<Fridge> getFridges(){
        return repository.findAll();
    }

    public Fridge getFridgeById(int id){
        return repository.findById(id).orElse(null);
    }

    //public Fridge getFridgeByUserId(int user_id){
        //return repository.findById(user_id).orElse(null);
    //}
    public String deleteFridge(int id){
        repository.deleteById(id);
        return "Fridge removed !!" +id;

    }


        public Fridge updateFridge(Fridge fridge){
        Fridge existingFridge = repository.findById(fridge.getId()).orElse(null);
        existingFridge.setUserId(fridge.getUserId());
        existingFridge.setProduct(fridge.getProduct());
        return repository.save(existingFridge);
         }

}
*/