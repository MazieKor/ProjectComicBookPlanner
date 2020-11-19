package pl.coderslab.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.fixtures.Fixture;

@Controller
public class StoreFixtureController {
    private Fixture fixture;

    @Autowired
    public StoreFixtureController(@Qualifier("storeFixture") Fixture fixture){
        this.fixture = fixture;
    }

    @RequestMapping("/storesFixtures")
    public String addStores(){
        fixture.createFixture();
        return "/main";
    }



}
