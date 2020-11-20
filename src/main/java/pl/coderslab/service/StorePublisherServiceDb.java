package pl.coderslab.service;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.dao.PurchaseDao;
import pl.coderslab.dao.StorePublisherDao;
import pl.coderslab.entity.Purchase;
import pl.coderslab.entity.StorePublisher;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class StorePublisherServiceDb implements StorePublisherService {
    StorePublisherDao storePublisherDao;


    @Override
    public void save(StorePublisher storePublisher) {
        storePublisherDao.save(storePublisher);
    }

    @Override
    public StorePublisher findById(Integer id) {
        return storePublisherDao.findById(id);
    }

    @Override
    public List<StorePublisher> findAll() {
        return storePublisherDao.findAll();
    }

    @Override
    public StorePublisher update(StorePublisher storePublisher) {
        return storePublisherDao.update(storePublisher);
    }

    @Override
    public void delete(StorePublisher storePublisher) {
        storePublisherDao.delete(storePublisher);
    }
}
