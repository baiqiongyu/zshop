package com.itany.zshop.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 李纪慰 on 2018/11/9.
 */
@Controller
@RequestMapping("/backend/sysuser")
public class SysuserController {
    @RequestMapping("/login")
    public String login(){
        return "main";
    }
}
