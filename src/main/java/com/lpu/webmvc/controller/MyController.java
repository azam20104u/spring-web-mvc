package com.lpu.webmvc.controller;

import com.lpu.webmvc.model.UserDTO;
import com.lpu.webmvc.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/") //indication to the Handler mapping
@Component
public class MyController {// this the class will behave as a controller class

    @Autowired
    private MyService service;

    @RequestMapping("/hi")
    public String hi() {
        return "hi";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/loginValidation", method = RequestMethod.POST)
    public ModelAndView loginValidation(@RequestParam String email, @RequestParam Long password){
        if (service.loginValidation(email,password)){
            return  new ModelAndView("loginSuccess","user",email);
        }else {
            return new ModelAndView("login","msg","login failed, please try again");
        }
    }

    @RequestMapping("/registration")
    public String registration() {
        return "registration";
    }



    @PostMapping("/registrationForm")
    public ModelAndView registrationForm(@ModelAttribute UserDTO dto){
        System.out.println("MyController registrationForm() has executed");
        service.save(dto);
        return new ModelAndView("regSuccess","dto",dto);
    }

    @RequestMapping("/modelview")
    public ModelAndView modelview(){
        return new ModelAndView("mv");
    }
    @RequestMapping("/mvdata")
    public ModelAndView mvata(){
        return new ModelAndView("viewuser", "user","azam20104u");
    }

}
