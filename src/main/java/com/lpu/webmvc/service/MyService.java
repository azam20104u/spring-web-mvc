package com.lpu.webmvc.service;

import com.lpu.webmvc.dao.MyDAO;
import com.lpu.webmvc.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {
    @Autowired
    private MyDAO dao;
    public Boolean save(UserDTO dto){
        System.out.println("MyService save() has executed...");
        System.out.println(dto.getFullName());
        System.out.println(dto.getEmail());
        dao.save(dto);
        return true;
    }
}
