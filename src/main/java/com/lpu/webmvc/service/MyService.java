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
        dao.save(dto);
        return true;
    }

    public boolean loginValidation(String email, Long password) {
        return dao.loginValidation(email, password);
    }
}
