/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import org.springframework.stereotype.Repository;
import com.example.demo.Modelo.Cloud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Interface.CloudInterface;
/**
 *
 * @author USUARIO
 */

@Repository

public class CloudRepository {
     @Autowired
    private CloudInterface cloudCrudRepository;
    
    public List<Cloud> getAll(){
        return (List<Cloud>) cloudCrudRepository.findAll();
    }
    
    public Optional<Cloud> getCloud(int id){
        return cloudCrudRepository.findById(id);
    }
    
    public Cloud save(Cloud cloud){
        return cloudCrudRepository.save(cloud);
    }

    public void delete(Cloud cloud){
        cloudCrudRepository.delete(cloud);                      
    }
}
