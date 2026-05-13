package com.lpu.webmvc.controller;

import com.lpu.webmvc.controller.model.UserDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/") //indication to the Handler mapping
@Component
public class MyController {// this the class will behave as a controller class

    @RequestMapping("/hi")
    public String hi() {
        return "hi";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/loginValidation", method = RequestMethod.POST)
    public ModelAndView loginValidation(@RequestParam String username, @RequestParam String password){
        if (username.equals("admin") && password.equals("admin1234")){
            return  new ModelAndView("loginSuccess","user",username);
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
        System.out.println(dto.getEmail());
        System.out.println(dto.getFullName());
        System.out.println(dto.getPassword());
        System.out.println(dto.getPhone());
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
