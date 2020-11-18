package pl.coderslab.service;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.dao.StoreDao;
import pl.coderslab.entity.Store;

@Service
@Primary
@AllArgsConstructor
public class StoreServiceDb implements StoreService{
    StoreDao storeDao;

    @Override
    public void save(Store store) {
        storeDao.save(store);
    }

    @Override
    public Store findById(Integer id) {
        return storeDao.findById(id);
    }

    @Override
    public Store update(Store store) {
        return storeDao.update(store);
    }

    @Override
    public void delete(Store store) {
        storeDao.delete(store);
    }
}
