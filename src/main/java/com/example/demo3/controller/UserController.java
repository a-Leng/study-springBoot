package com.example.demo3.controller;

import com.example.demo3.service.UserService;
import com.example.demo3.util.response.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String test(){
        System.out.println("===================");
        return "Hello";
    }

    @GetMapping("/login")
    public ResponseMsg login(@RequestParam String name){
        ResponseMsg msg=new ResponseMsg();
//        userService.login(name);
        msg.setCode(200);
        msg.setMsg("success");
        msg.setData(userService.login(name));
        return msg;
    }

    @GetMapping("/register")
    public ResponseMsg register(Integer id, String name, String des){
        ResponseMsg msg=new ResponseMsg();
        userService.registered(id,name,des);
        msg.setCode(200);
        msg.setMsg("success");
        msg.setData(null);
        return msg;
    }

    @GetMapping("/getAllUserInfo")
    public ResponseMsg getAllUserInfo(){
        ResponseMsg msg = new ResponseMsg();
        msg.setCode(1);
        msg.setMsg("success");
        msg.setData(userService.getALlUserInfo());
        return msg;
    }
}
