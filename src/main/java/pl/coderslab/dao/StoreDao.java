package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Plan;
import pl.coderslab.entity.Publisher;
import pl.coderslab.entity.Store;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StoreDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Store store){
        entityManager.persist(store);
    }

    public Store findById(Integer id){
        return entityManager.find(Store.class, id);
    }

    public List<Store> findAll(){
        Query query = entityManager.createQuery("Select stores FROM Store stores");
        return query.getResultList();
    }

    public Store update(Store store){
        return entityManager.merge(store);
    }

    public void delete(Store store){
        entityManager.remove(entityManager.contains(store) ? store : entityManager.merge(store));
    }

}
