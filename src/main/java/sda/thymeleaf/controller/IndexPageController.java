package sda.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sda.thymeleaf.dbo.Person;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexPageController {

    private List<Person> persons = new ArrayList<>();

    public IndexPageController() {
        persons.add(new Person("Daniel", "Richards", 26, "M"));
        persons.add(new Person("Sander", "One", 15, "M"));
        persons.add(new Person("Linda", "Two", 90, "F"));
    }

    @RequestMapping("/")
    public String mainPage(Model model) {
        //this is like in JSP setAttribute

        model.addAttribute("greeting", "Hello fellow samaritan");
        model.addAttribute("person", new Person("Alo", "Nelis", 30, "M"));
        model.addAttribute("persons", persons);
        model.addAttribute("newPerson", new Person());
        return "index";
    }

    @RequestMapping(value = "/savePerson", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute Person person){
        persons.add(person);
        return "redirect:/";
    }
}
