package pl.coderslab.service;

import pl.coderslab.entity.Publisher;
import pl.coderslab.entity.Purchase;

import java.util.List;

public interface PublisherService {
    public void save(Publisher publisher);
    public Publisher findById(Integer id);
    public List<Publisher> findAll();
    public Publisher update (Publisher publisher);
    public void delete (Publisher publisher);

}
