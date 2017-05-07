package com.cgj.spring.mvc.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("verify/code")
public class VerifyCodeController {

    @RequestMapping("/img")
    public void getVerifyCodeImg(HttpServletResponse response, HttpSession session){

    }
}
