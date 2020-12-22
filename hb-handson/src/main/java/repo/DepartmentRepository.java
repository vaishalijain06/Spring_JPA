package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
