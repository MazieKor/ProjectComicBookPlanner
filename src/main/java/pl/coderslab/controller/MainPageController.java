package pl.coderslab.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.dao.PublisherDao;
import pl.coderslab.dao.PurchaseDao;
import pl.coderslab.fixtures.PublisherFixture;

@Controller
@AllArgsConstructor
public class MainPageController {
    PublisherDao publisherDao;

    @RequestMapping("/")
    public String form(){
        return "/main";
    }

//    @RequestMapping("/check")
//    @ResponseBody
//    public String check(){
//
//        return publisherDao.findByPublisher().toString();
//    }





}
