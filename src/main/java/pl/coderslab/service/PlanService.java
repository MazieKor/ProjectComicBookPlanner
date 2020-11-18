package pl.coderslab.service;

import pl.coderslab.entity.Plan;

public interface PlanService {
    public void save(Plan plan);
    public Plan findById(Integer id);
    public Plan update (Plan plan);
    public void delete (Plan plan);


}
