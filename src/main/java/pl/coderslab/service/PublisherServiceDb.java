package pl.coderslab.service;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.dao.PublisherDao;
import pl.coderslab.entity.Publisher;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class PublisherServiceDb implements PublisherService{
    PublisherDao publisherDao;

    @Override
    public void save(Publisher publisher) {
        publisherDao.save(publisher);
    }

    @Override
    public Publisher findById(Integer id) {
        return publisherDao.findById(id);
    }

    @Override
    public List<Publisher> findAll() {
        return publisherDao.findAll();
    }

    @Override
    public Publisher update(Publisher publisher) {
        return publisherDao.update(publisher);
    }

    @Override
    public void delete(Publisher publisher) {
        publisherDao.delete(publisher);
    }
}
