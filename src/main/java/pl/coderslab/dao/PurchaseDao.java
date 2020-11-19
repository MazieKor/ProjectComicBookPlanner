package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Plan;
import pl.coderslab.entity.Purchase;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PurchaseDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Purchase purchase){
        entityManager.persist(purchase);
    }

    public Purchase findById(Integer id){
        return entityManager.find(Purchase.class, id);
    }

    public List<Purchase> findAll(){
        Query query = entityManager.createQuery("Select purchases FROM Purchase purchases");
        return query.getResultList();
    }

    public Purchase update(Purchase purchase){
        return entityManager.merge(purchase);
    }

    public void delete(Purchase purchase){
        entityManager.remove(entityManager.contains(purchase) ? purchase : entityManager.merge(purchase));
    }

}
