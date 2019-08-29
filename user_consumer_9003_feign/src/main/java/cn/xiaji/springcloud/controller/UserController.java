package cn.xiaji.springcloud.controller;
//encoding: utf-8

import cn.xiaji.springcloud.client.UserClient;
import cn.xiaji.springcloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: xj
 * @contact: xiaruji520@gmail.com
 * @file: UserController.java
 */
/*

 */
@RestController
@RequestMapping("/user/consumer")
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Long id) {
        System.out.println("url:" + userClient.getUserById(id));
        return userClient.getUserById(id);
    }

}