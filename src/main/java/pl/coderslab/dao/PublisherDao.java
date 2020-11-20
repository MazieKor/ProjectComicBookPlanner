package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Plan;
import pl.coderslab.entity.Publisher;
import pl.coderslab.entity.Purchase;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PublisherDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Publisher publisher){
        entityManager.persist(publisher);
    }

    public Publisher findById(Integer id){
        return entityManager.find(Publisher.class, id);
    }

    public List<Publisher> findAll(){
        Query query = entityManager.createQuery("Select publishers FROM Publisher publishers");
        return query.getResultList();
    }

    //przykład
    public List<Publisher> findByPublisher(){
        Query query = entityManager.createQuery("Select pub FROM Publisher pub JOIN fetch pub.storePublisherList pl");

        return (List<Publisher>) query.getResultList();
    }

    public Publisher update(Publisher publisher){
        return entityManager.merge(publisher);
    }

    public void delete(Publisher publisher){
        entityManager.remove(entityManager.contains(publisher) ? publisher : entityManager.merge(publisher));
    }

}
