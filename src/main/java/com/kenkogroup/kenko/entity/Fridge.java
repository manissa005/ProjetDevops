package com.kenkogroup.kenko.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table()

public class Fridge {
    @Id
    @GeneratedValue

    private int id;
    private int userId;
    private Map<String, Float> product;



    }
}
