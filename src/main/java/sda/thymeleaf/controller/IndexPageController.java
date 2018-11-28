package sda.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sda.thymeleaf.dbo.Person;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexPageController {

    @RequestMapping("/")
    public String mainPage(Model model) {
        //this is like in JSP setAttribute

        model.addAttribute("greeting", "Hello fellow samaritan");
        model.addAttribute("person", new Person("Alo", "Nelis", 30));

        List<Person> students = new ArrayList<>();
        students.add(new Person("Daniel", "Richards", 26));
        students.add(new Person("Sander", "One", 15));
        students.add(new Person("Oskar", "Two", 90));
        model.addAttribute("students", students);

        return "index";
    }
}
