package com.shipparts.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class IndexController {

    @RequestMapping("/index")
    public String index1(){
        System.out.println("+++++++++++++++++index");
        return "index";
    }

    @RequestMapping("/index2")
    public String index2(){
        System.out.println("+++++++++++++++++index2");
        return "index";
    }

    @RequestMapping("/pay")
    public String pay(){
        System.out.println("+++++++++++++++++pay");
        return "index";
    }
}
