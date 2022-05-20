package com.saitej.controller;


import com.saitej.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    @RequestMapping("/login")
    public String loginAction(){
        return "userform";
    }



    @RequestMapping("/handleform")
    public String cutomerForm(@ModelAttribute Customer customer){
        System.out.println(customer);
        return "success";

    }
}
