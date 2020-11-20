package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Publisher;
import pl.coderslab.entity.Purchase;
import pl.coderslab.service.PublisherService;
import pl.coderslab.service.PurchaseService;

import javax.validation.Valid;
import javax.validation.Validator;
import java.util.Collection;
import java.util.List;

@Controller
public class PurchaseController {
    private PurchaseService purchaseService;
    private PublisherService publisherService;
    private Validator validator;

    @Autowired
    public PurchaseController(PurchaseService purchaseService, PublisherService publisherService, Validator validator){
        this.purchaseService = purchaseService;
        this.publisherService = publisherService;
        this.validator = validator;
    }


    @RequestMapping("/form")
    public String form(Model model){
        Purchase purchase = new Purchase();
        model.addAttribute("purchase", purchase);
        return "purchaseForm";
    }

    @RequestMapping("/newPurchase")
    public String save(@Valid Purchase purchase, BindingResult result){
        if(result.hasErrors()){
            return "purchaseForm";
        }
        purchaseService.save(purchase);
        return "redirect:form";
    }

    @RequestMapping("/newPurchase_Exit")
    public String saveAndExit(@ModelAttribute Purchase purchase){
        purchaseService.save(purchase);
        return "main";
    }

    @RequestMapping("/listToPurchase")
    public String showSavedComicBooks(Model model){
        List<Purchase> purchchaseList = purchaseService.findAll();
        model.addAttribute("purchaseList", purchchaseList);
        return "tablePurchases";
    }

    @GetMapping("/deletePurchase/{id}")
    public String deleteSavedComicBook(@PathVariable Integer id){
        Purchase purchase = purchaseService.findById(id);
        purchaseService.delete(purchase);
        return "redirect:/listToPurchase";
    }

    @GetMapping("/detailsPurchase/{id}")
    public String showDetailsOnComicBook(@PathVariable Integer id, Model model){
        Purchase purchase = purchaseService.findById(id);
        model.addAttribute("purchase", purchase);
        return "detailsTable";
    }


    @ModelAttribute("publishers")
    public Collection<Publisher> publishers() {
        return this.publisherService.findAll();
    }


}
