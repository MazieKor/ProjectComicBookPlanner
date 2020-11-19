package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.fixtures.PublisherFixture;

@Controller
@RequestMapping
public class MainPageController {


    @RequestMapping("/")
    public String form(){
        return "/main";
    }



}
