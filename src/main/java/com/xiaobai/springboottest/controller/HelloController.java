package com.xiaobai.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public Map<String,String> hello(@RequestParam("name")String name){
        Map<String,String> map = new HashMap<String,String>();
        map.put("msg","Hello " + name);
        return map;
    }
}
