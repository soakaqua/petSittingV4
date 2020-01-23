package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Compte;
import model.Sitter;

public interface CompteRepository extends JpaRepository<Compte, Integer>{
	
	public List<Sitter> selectSittersByReponseValidee(Integer numA);
	
	
}
