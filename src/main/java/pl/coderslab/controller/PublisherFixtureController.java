package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.fixtures.Fixture;

@Controller
public class PublisherFixtureController {
    private Fixture fixture;

    @Autowired
    public PublisherFixtureController(@Qualifier("publisherFixture") Fixture fixture){
        this.fixture = fixture;
    }

    @RequestMapping("/publishersFixtures")
    public String addStores(){
        fixture.createFixture();
        return "/main";
    }


}
