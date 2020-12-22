package repo;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Job_History;

@Repository
public interface Job_HistoryRepository extends JpaRepository<Job_History, Date>{

}
