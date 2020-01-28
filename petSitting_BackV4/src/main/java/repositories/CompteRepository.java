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
	

	
	
}
