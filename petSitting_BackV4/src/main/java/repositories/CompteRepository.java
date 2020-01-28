package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Compte;
import model.Sitter;

public interface CompteRepository extends JpaRepository<Compte, Integer>{
	
	public List<Sitter> selectSittersByReponseValidee(Integer numA);
	
	@Query("select c from Compte c where c.mail=?1 and c.mdp=?2")
	List<Compte> checkID(String mail, String mdp);
	
	
}
