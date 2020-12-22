package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
