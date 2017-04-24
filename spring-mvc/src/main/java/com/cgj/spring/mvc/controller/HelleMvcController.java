package com.cgj.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelleMvcController {

    @RequestMapping("/mvc")
    public String helloSpringMVC(Model model) {
        String sayHello = "Hello spring MVC! My name is Guangjin.chen";
        model.addAttribute("text", sayHello);
        return "home";
    }

    @RequestMapping(value = "/param1", method = RequestMethod.GET)
    public String paramDemo1(@RequestParam("param") Integer number, Model model) {
        model.addAttribute("number",number);
        return "home";
    }

    @RequestMapping(value = "/param2/{param}", method = RequestMethod.GET)
    public String paramDemo2(@PathVariable("param") Integer number, Model model) {
        model.addAttribute("number",number);
        return "home";
    }

    @RequestMapping(value = "/param3", method = RequestMethod.GET)
    public String paramDemo2(HttpServletRequest request) {
        Integer number = Integer.valueOf(request.getParameter("param"));
        request.setAttribute("number", number);
        return "home";
    }
}
