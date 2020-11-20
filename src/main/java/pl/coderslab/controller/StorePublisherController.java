package pl.coderslab.controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.entity.Publisher;
import pl.coderslab.entity.Purchase;
import pl.coderslab.entity.Store;
import pl.coderslab.entity.StorePublisher;
import pl.coderslab.service.PublisherService;
import pl.coderslab.service.PurchaseService;
import pl.coderslab.service.StorePublisherService;
import pl.coderslab.service.StoreService;

import java.util.List;

@Controller
@AllArgsConstructor
public class StorePublisherController {
    PublisherService publisherService;
    StoreService storeService;
    StorePublisherService storePublisherService;


    @GetMapping("/discounts")
    public String discounts(Model model){
        StorePublisher storePublisher = new StorePublisher();
        model.addAttribute("storePublisher", storePublisher);
        List<Publisher> publisherList = publisherService.findAll();
        model.addAttribute("publisherList", publisherList);
        List<Store> storeList = storeService.findAll();
        model.addAttribute("storeList", storeList);
        return "discountsForm";
    }

//    @PostMapping("/newDiscount")
//    public String saveDiscount(@ModelAttribute StorePublisher storePublisher){
//        storePublisherService.save(storePublisher);
//        return "redirect:discounts";
//    }

    @PostMapping("/discounts")
    public String saveDiscountAndExit(@ModelAttribute StorePublisher storePublisher){
        storePublisherService.save(storePublisher);
        return "main";
    }



}
