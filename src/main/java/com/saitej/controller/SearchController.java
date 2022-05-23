package com.saitej.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping("/home")
    public String showHomePage(){

        return "home";
    }


    @RequestMapping("/search")
    public RedirectView doSearch(@RequestParam("querybox") String query){

        String URL= "http://www.google.com/search?q="+query;

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(URL);
        return  redirectView;
    }
}
