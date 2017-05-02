package com.cgj.spring.mvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/hello")
public class HelleMvcController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/home")
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

    @RequestMapping(value = "file", method = RequestMethod.GET)
    public String showUploadFilePage() {
        return "file";
    }

    @RequestMapping(value = "date", method = RequestMethod.GET)
    @ResponseBody
    public Date getDateJson() {
        return new Date();
    }

    @RequestMapping(value = "/interceptor", method = RequestMethod.GET)
    public String testInterceptor() {
        return "home";
    }

    @RequestMapping("/init")
    public String initAttribute() {
        return "init";
    }

    @RequestMapping("/destroyed")
    public String destroyedAttribute() {
        return "destroyed";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String doUploadFile(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            logger.info("Process file:{}", file.getOriginalFilename());
            try {
                FileUtils.copyInputStreamToFile(file.getInputStream(),
                        new File("D:\\Download", System.currentTimeMillis() + file.getOriginalFilename()));
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
        return "success";
    }
}
