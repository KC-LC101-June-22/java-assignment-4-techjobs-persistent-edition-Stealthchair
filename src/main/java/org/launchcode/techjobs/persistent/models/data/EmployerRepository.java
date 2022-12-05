package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

//Part 2: Stores employers
@Repository
public interface EmployerRepository extends CrudRepository<Employer, Integer> {
}
