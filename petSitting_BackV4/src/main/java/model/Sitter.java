package model;

import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@NamedQueries({
@NamedQuery(name="Sitter.selectSittersByReponseValidee",query="select distinct s from Sitter s left join fetch s.reponses rep where rep.key.annonce.numA=?1")
})

@Entity
@DiscriminatorValue("S")
public class Sitter extends Compte {

	@OneToMany(mappedBy = "key.sitter") //erreur bidon ici
	private Set<Reponse> reponses;
	
	public Sitter(Integer numC, Integer cp, String mdpC, String mail, String nom, String prenom) {
	}

	public Sitter() {

	}

//	public static List<Annonce> afficherAnnoncesEnCours(){ // attention : supprimer static dans classe ?.
//		EntityManager em=JpaContext.getInstance().createEntityManager();
//		DaoAnnonce daoAnnonce = DaoAnnonceFactory.getInstance(); // attention : supprimer ligne dans dao.
//		List<Annonce> annonces=null;
////		annonces = SelectAllWithStatut0(); //Attention : a remplacer par ligne du dessous.
//		annonces = daoAnnonce.SelectAllWithStatut0();
//		
//		em.close();
//
//		return annonces;
//	}
//	
//	public static void postulerAnnonce(Sitter s, Annonce a, String message) {
//		EntityManager em=JpaContext.getInstance().createEntityManager();
//		DaoReponse daoReponse = DaoReponseFactory.getInstance(); // attention : supprimer ligne dans dao.
//		ReponsePK key = new ReponsePK((Sitter) s, a);
//		Reponse rep = new Reponse(key, message);
//		System.out.println(s.getNumC());
//		daoReponse.insert(rep);
//		
//		
//		em.close();
//	
//	
//	}

	
}
