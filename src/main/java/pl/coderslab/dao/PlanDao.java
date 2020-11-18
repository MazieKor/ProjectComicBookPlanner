package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Plan;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PlanDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Plan plan){
        entityManager.persist(plan);
    }

    public Plan findById(Integer id){
        return entityManager.find(Plan.class, id);
    }

    public Plan update(Plan plan){
        return entityManager.merge(plan);
    }

    public void delete(Plan plan){
        entityManager.remove(entityManager.contains(plan) ? plan : entityManager.merge(plan));
    }


}
