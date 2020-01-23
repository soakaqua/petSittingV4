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
	
//    public List<Annonce> selectAnnonceBySitter(Integer numC)  { // afficherAnnoncesPostulees(); Consulter mes annonces SITTER
//        EntityManager em=JpaContext.getInstance().createEntityManager();
//        List<Annonce> annonces=null;
//        Query query=em.createQuery("select distinct a from Annonce a left join fetch a.Reponse rep where rep.numC=:numC");
//        query.setParameter("numC", numC);
//        annonces=query.getResultList();
//        em.close();
//        return annonces;
//    }





//    public void noterP(Double noteP, Annonce a) {
//        EntityManager em=JpaContext.getInstance().createEntityManager();
//        DaoAnnonce daoAnnonce = DaoAnnonceFactory.getInstance(); // attention : supprimer ligne dans dao.
//        Annonce annonce=null;
//        int numC = a.getNumC();
//        Query query=em.createQuery("select a from Annonce a where a.numC=:numC and a.statut=1");
//        query.setParameter("numC", numC);
//
//       annonce=(Annonce) query.getSingleResult();
//
//        annonce.setNoteP(noteP);
//
//
//        daoAnnonce.update(annonce);
//
//        em.close();
//
//
//    }
//
//    public Double getNoteMoyenne(Proprio p) {
//        EntityManager em=JpaContext.getInstance().createEntityManager();
//        int numC=p.getNumC();
//        Query query=em.createQuery("select AVG(p.noteP) from Proprio p where p.numC=:numC");
//        query.setParameter("numC", numC);
//        Double moyenne=(Double) query.getSingleResult();
//        em.close();
//        return moyenne;
//
//
//    }
	
	
	
//	public List<Annonce> selectAnnonceBySitter(Integer numC)  { // afficherAnnoncesPostulees(); Consulter mes annonces SITTER
//		EntityManager em=JpaContext.getInstance().createEntityManager();
//		List<Annonce> annonces=null;
//		Query query=em.createQuery("select distinct a from Annonce a left join fetch a.Reponse rep where rep.numC=:numC");  
//		query.setParameter("numC", numC);
//		annonces=query.getResultList();
//		em.close();
//		return annonces;
//	}
//	

	
	//----- Test selectAnnonceBySitter --------
	
//	
//	public void afficherAnnoncesPostulees() {
//	DaoAnnonce daoAnnonce = DaoAnnonceFactory.getInstance(); //appeller methode selectAnnonceBySitter
//	List<Annonce> a = (List<Annonce>) new Annonce();
//    a =daoAnnonce.selectAnnonceBySitter(100); //class.methode
//   System.out.println(a);
//	}
//	
	
	
    //----- Test selectById --------c'est OKI!
//	DaoService daoService = DaoServiceFactory.getInstance();
//	Service s = new Service();
//    s =daoService.selectById(100); //class.methode
//    System.out.println(s);
	
	
	
	
	
	//----- Test Insert -------- c'est OKI!
//    DaoService daoService = DaoServiceFactory.getInstance();
//    Service s = new Service();
//    s.setNomSer("Garde chez proprio");
//    s.setPrix(10);
//    daoService.insert(s);
//    Service s2 = new Service();
//    s2.setNomSer("Garde chez sitter");
//    s2.setPrix(15);
//    daoService.insert(s2);

	
}
