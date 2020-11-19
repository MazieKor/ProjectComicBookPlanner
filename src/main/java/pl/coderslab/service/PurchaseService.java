package pl.coderslab.service;

import pl.coderslab.entity.Plan;
import pl.coderslab.entity.Purchase;

import java.util.List;

public interface PurchaseService {
    public void save(Purchase purchase);
    public Purchase findById(Integer id);
    public List<Purchase> findAll();
    public Purchase update (Purchase purchase);
    public void delete (Purchase purchase);

}
