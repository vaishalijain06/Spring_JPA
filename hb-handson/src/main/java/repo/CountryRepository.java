package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{

}
