package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Reponse;
import model.ReponsePK;

public interface ReponseRepository extends JpaRepository<Reponse,ReponsePK> {

	public List<Reponse> selectReponsesRefusees(Integer numA, Integer numC);
	
	
	
}
