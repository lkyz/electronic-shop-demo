package me.likeyao.electronic.shop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/api")
@Controller
public class EchoController {

    @RequestMapping("/echo")
    @ResponseBody
    public String echo(@RequestParam("str") String str){
        return str;
    }

}
