package com.smart.lianmeng;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayHello")
public class RestfullianmengController {


    @RequestMapping(value = "/test")
    @ResponseBody
    private String  sayHello() {
        System.out.println("Hello this is springboots !!!");





        return "hello";
    }
}
