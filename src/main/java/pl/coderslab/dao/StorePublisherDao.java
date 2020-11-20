package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Publisher;
import pl.coderslab.entity.StorePublisher;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StorePublisherDao {
    @PersistenceContext
    EntityManager entityManager;

    public void save(StorePublisher storePublisher){
        entityManager.persist(storePublisher);
    }

    public StorePublisher findById(Integer id){
        return entityManager.find(StorePublisher.class, id);
    }

    public List<StorePublisher> findAll(){
        Query query = entityManager.createQuery("Select storePublishers FROM StorePublisher storePublishers");
        return query.getResultList();
    }

    public StorePublisher update(StorePublisher storePublisher){
        return entityManager.merge(storePublisher);
    }

    public void delete(StorePublisher storePublisher){
        entityManager.remove(entityManager.contains(storePublisher) ? storePublisher : entityManager.merge(storePublisher));
    }

}
