package com.paic.dmz.model01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserControoller {

    @Value("${cupSize}")
    private  String cupSize;
    @RequestMapping("/hello")
    public String sayHi(ModelAndView mav){

        return  "Hello World!test"+ cupSize;
    }
}
