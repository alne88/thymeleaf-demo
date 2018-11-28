package sda.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {

    @RequestMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("greeting", "Hello fellow samaritan");
        return "index";
    }
}
