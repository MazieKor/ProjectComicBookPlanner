package pl.coderslab.service;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.dao.PlanDao;
import pl.coderslab.entity.Plan;

@Service
@Primary
@AllArgsConstructor
public class PlanServiceDb implements PlanService {
    PlanDao planDao;

    @Override
    public void save(Plan plan) {
        planDao.save(plan);
    }

    @Override
    public Plan findById(Integer id) {
        return planDao.findById(id);
    }

    @Override
    public Plan update(Plan plan) {
        return planDao.update(plan);
    }

    @Override
    public void delete(Plan plan) {
        planDao.delete(plan);
    }
}
