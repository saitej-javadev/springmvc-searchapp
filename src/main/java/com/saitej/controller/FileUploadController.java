package com.saitej.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class FileUploadController {


    @RequestMapping("/upload")
    public String showUploadForm(){
        return "fileForm";
    }

    @PostMapping("/uploadFile")
    public ModelAndView fileUpload(@RequestParam("profile") CommonsMultipartFile file,
                                   HttpSession session) throws IOException {

        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getStorageDescription());
        byte[] data = file.getBytes();

        String path = session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator
                +"resources"+File.separator
                +"images"+File.separator+file.getOriginalFilename();

        System.out.println(path);
        FileOutputStream fos = new FileOutputStream(path);
        fos.write(data);
        fos.close();
        System.out.println("file uploaded");
        ModelAndView mav = new ModelAndView();
        mav.addObject("filename",file.getOriginalFilename());
        mav.setViewName("filesuccess");
        return mav;

    }


}


