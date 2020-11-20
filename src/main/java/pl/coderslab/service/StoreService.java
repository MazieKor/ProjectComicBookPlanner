package pl.coderslab.service;

import pl.coderslab.entity.Plan;
import pl.coderslab.entity.Publisher;
import pl.coderslab.entity.Store;

import java.util.List;

public interface StoreService {
    public void save(Store store);
    public Store findById(Integer id);
    public List<Store> findAll();
    public Store update (Store store);
    public void delete (Store store);
}
