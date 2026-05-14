package com.lpu.webmvc.dao;

import com.lpu.webmvc.model.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class MyDAO {
    public Boolean save(UserDTO dto){
        System.out.println("MyDAO save() has executed...");
        System.out.println(dto.getFullName());
        System.out.println(dto.getEmail());
        return true;
    }
}
