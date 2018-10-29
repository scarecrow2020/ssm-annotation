package com.lzy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("findUserList")
    public Object findUserList() {
        System.out.println("success");
        return "lzy annotation";
    }
}
