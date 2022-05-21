package com.saitej.controller;

import com.saitej.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class FileUploadController {


    @RequestMapping("/upload")
    public String showUploadForm(){
        return "fileForm";
    }

    @PostMapping("/uploadFile")
    public ModelAndView fileUpload(@RequestParam("profile") CommonsMultipartFile file){

        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getStorageDescription());
        ModelAndView mav = new ModelAndView();
        mav.setViewName("filesuccess");
        return mav;

    }


}


