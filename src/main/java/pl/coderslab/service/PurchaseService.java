package pl.coderslab.service;

import pl.coderslab.entity.Plan;
import pl.coderslab.entity.Purchase;

public interface PurchaseService {
    public void save(Purchase purchase);
    public Purchase findById(Integer id);
    public Purchase update (Purchase purchase);
    public void delete (Purchase purchase);

}
