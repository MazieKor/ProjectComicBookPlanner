package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Purchase;
import pl.coderslab.service.PurchaseService;

@Controller
public class PurchaseController {
    private PurchaseService purchaseService;

    @Autowired
    public PurchaseController(PurchaseService purchaseService){
        this.purchaseService = purchaseService;
    }

    @RequestMapping("/form")
    public String form(){

        return "purchaseForm";
    }

//    @RequestMapping("/newPurchase")
//    public String save(@ModelAttribute Purchase purchase){
//        purchaseService.save(purchase);
//        return "main";
//    }

    @RequestMapping("/newPurchase")
    public String save(@RequestParam String title){
        Purchase purchase =new Purchase();
        purchase.setTitle(title);
        purchaseService.save(purchase);
        return "main";
    }

}
