package com.spring;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String askEmp(Model model){
        model.addAttribute("emp", new Employee());
        return "ask-emp-det";
    }

    @RequestMapping("/showDetails")
    public String showEmp(@ModelAttribute("emp") Employee emp){
        return "show-emp-det";
    }
}
