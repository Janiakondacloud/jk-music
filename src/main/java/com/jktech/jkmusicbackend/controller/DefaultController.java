package com.jktech.jkmusicbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Janiak
 * @Date: 2022/05/10/14:49
 * @Description:
 */
@RestController
@RequestMapping("/hello")
public class DefaultController {
    @GetMapping
    public String sayHello(){
        return "hellojkmusic";
    }
}
