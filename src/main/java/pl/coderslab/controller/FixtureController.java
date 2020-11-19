package pl.coderslab.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.fixtures.Fixture;
import pl.coderslab.fixtures.PublisherFixture;
import pl.coderslab.fixtures.StoreFixture;

@Controller
@AllArgsConstructor
public class FixtureController {
    PublisherFixture publisherFixture;
    StoreFixture storeFixture;

    @RequestMapping("/publishersFixtures")
    public String addPublishers(){
        publisherFixture.createFixture();
        return "/main";
    }

    @RequestMapping("/storesFixtures")
    public String addStores(){
        storeFixture.createFixture();
        return "/main";
    }

}