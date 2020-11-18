package pl.coderslab.service;

import pl.coderslab.entity.Plan;
import pl.coderslab.entity.Store;

public interface StoreService {
    public void save(Store store);
    public Store findById(Integer id);
    public Store update (Store store);
    public void delete (Store store);
}
