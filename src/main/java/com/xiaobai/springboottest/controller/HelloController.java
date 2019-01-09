package com.xiaobai.springboottest.controller;

import com.xiaobai.springboottest.bean.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public Message hello(@RequestParam("name")String name){
        Message message = new Message();
        message.setMessage("Hello " + name + "!");
        return message;
    }
}
