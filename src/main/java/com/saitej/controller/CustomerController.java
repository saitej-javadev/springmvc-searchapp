package com.saitej.controller;


import com.saitej.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @RequestMapping("/login")
    public String loginAction(){
       /* String str = null;// excplicitly generating exception
        str.length();*/
        return "userform";
    }



    @RequestMapping("/handleform")
    public String cutomerForm(@ModelAttribute Customer customer){
        System.out.println(customer);
        return "success";

    }

    @ExceptionHandler(NullPointerException.class)
    public String handleException( NullPointerException e,Model model){
        System.out.println(e.getMessage());
        model.addAttribute("exception" ,e);
        return "error";
    }
}
