package com.flyfish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @autohr flyfish
 * @date: 2023/2/26 14:14
 * @description:
 */
@RequestMapping("/common")
@Controller
public class CommonController {
    @RequestMapping("/tologin")
    public String toLogin(){
        return "login";
    }
}
