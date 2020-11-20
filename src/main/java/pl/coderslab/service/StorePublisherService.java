package pl.coderslab.service;

import pl.coderslab.entity.StorePublisher;

import java.util.List;

public interface StorePublisherService {
    public void save(StorePublisher storePublisher);
    public StorePublisher findById(Integer id);
    public List<StorePublisher> findAll();
    public StorePublisher update (StorePublisher storePublisher);
    public void delete (StorePublisher storePublisher);
}
