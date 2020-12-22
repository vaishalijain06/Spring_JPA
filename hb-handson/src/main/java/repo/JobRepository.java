package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer>{

}
