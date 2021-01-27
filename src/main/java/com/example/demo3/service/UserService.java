package com.example.demo3.service;

import com.example.demo3.entity.UserEntity;
import com.example.demo3.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public UserEntity login(String name){
        return userRepository.login(name);
    }

    public void registered(Integer id,String name,String des){
        userRepository.addUser(id, name, des);
        return;
    }

    public UserEntity getALlUserInfo(){
        return userRepository.getAllUserInfo();
    }

}
