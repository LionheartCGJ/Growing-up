package com.cgj.spring.mvc.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cgj.spring.mvc.utils.VerifyCodeUtil;

@Controller
@RequestMapping("verify/code")
public class VerifyCodeController {

    @RequestMapping("page")
    public String verifyCodePage() {
        return "verifyCode";
    }

    @RequestMapping("/img")
    public void getVerifyCodeImg(HttpServletResponse response, HttpSession session) {
        Object[] verify = VerifyCodeUtil.createVerifyCodeImg();
        session.setAttribute("verifyCode", verify[0]);
        response.setContentType("image/png");
        try {
            ImageIO.write((BufferedImage) verify[1], "png", response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("verify")
    public String verify(HttpServletRequest request, HttpSession session) {
        String codeFromSession = (String) session.getAttribute("verifyCode");
        String codeFromPage = request.getParameter("verifyCode");
        if (codeFromSession != null && codeFromSession.equals(codeFromPage)) {
            return "success";
        } else {
            return "failure";
        }
    }
}
