package pl.coderslab.service;


import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.dao.PurchaseDao;
import pl.coderslab.entity.Purchase;

import javax.transaction.Transactional;

@Service
@Primary
@AllArgsConstructor
public class PurchaseServiceDb implements PurchaseService{
    PurchaseDao purchaseDao;

    @Override
    public void save(Purchase purchase) {
        purchaseDao.save(purchase);
    }

    @Override
    public Purchase findById(Integer id) {
        return purchaseDao.findById(id);
    }

    @Override
    public Purchase update(Purchase purchase) {
        return purchaseDao.update(purchase);
    }

    @Override
    public void delete(Purchase purchase) {
        purchaseDao.delete(purchase);
    }

}