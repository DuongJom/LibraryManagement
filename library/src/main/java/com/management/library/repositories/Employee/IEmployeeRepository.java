package com.management.library.repositories.Employee;

import com.management.library.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends MongoRepository<Employee, Long> {
}
