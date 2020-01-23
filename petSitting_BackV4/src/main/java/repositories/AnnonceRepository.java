package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Annonce;
import model.*;

public interface AnnonceRepository extends JpaRepository<Annonce, Integer> {
 
	
	//NAMED QUERIES DANS ANNONCE
	public List<Annonce> selectAnnonceByProprio(int numC);
	public List<Annonce> afficherAnnoncesTerminees(Integer numC);
	public List<Annonce> selectAnnonceBySitter(Integer numC);
	//public List<Sitter> selectSittersByReponseValidee(Integer numA);
	//public List<Integer> selectNoteSitter(Integer numC);
	public List<Annonce> selectAllWithStatut0();
	

}





