package services;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Annonce;

import model.Reponse;
import model.ReponsePK;
import model.Sitter;

@Service
public class SitterService {
 
	
	
//	
//	
//	public static List<Annonce> afficherAnnoncesEnCours(){ // attention : supprimer static dans classe ?.
//		 daoAnnonce = DaoAnnonceFactory.getInstance(); // attention : supprimer ligne dans dao.
//		List<Annonce> annonces=null;
////		annonces = SelectAllWithStatut0(); //Attention : a remplacer par ligne du dessous.
//		annonces = daoAnnonce.SelectAllWithStatut0();
//		
//
//		return annonces;
//	}
//	
//	public static void postulerAnnonce(Sitter s, Annonce a, String message) {
//		DaoReponse daoReponse = DaoReponseFactory.getInstance(); // attention : supprimer ligne dans dao.
//		ReponsePK key = new ReponsePK((Sitter) s, a);
//		Reponse rep = new Reponse(key, message);
//		System.out.println(s.getNumC());
//		daoReponse.insert(rep);
//		
		
	
	
	
	
//   public List<Annonce> selectAnnonceBySitter(Integer numC)  { // afficherAnnoncesPostulees(); Consulter mes annonces SITTER
//       EntityManager em=JpaContext.getInstance().createEntityManager();
//       List<Annonce> annonces=null;
//       Query query=em.createQuery("select distinct a from Annonce a left join fetch a.Reponse rep where rep.numC=:numC");
//       query.setParameter("numC", numC);
//       annonces=query.getResultList();
//       em.close();
//       return annonces;
//   }





//   public void noterP(Double noteP, Annonce a) {
//       EntityManager em=JpaContext.getInstance().createEntityManager();
//       DaoAnnonce daoAnnonce = DaoAnnonceFactory.getInstance(); // attention : supprimer ligne dans dao.
//       Annonce annonce=null;
//       int numC = a.getNumC();
//       Query query=em.createQuery("select a from Annonce a where a.numC=:numC and a.statut=1");
//       query.setParameter("numC", numC);
//
//      annonce=(Annonce) query.getSingleResult();
//
//       annonce.setNoteP(noteP);
//
//
//       daoAnnonce.update(annonce);
//
//       em.close();
//
//
//   }
//
//   public Double getNoteMoyenne(Proprio p) {
//       EntityManager em=JpaContext.getInstance().createEntityManager();
//       int numC=p.getNumC();
//       Query query=em.createQuery("select AVG(p.noteP) from Proprio p where p.numC=:numC");
//       query.setParameter("numC", numC);
//       Double moyenne=(Double) query.getSingleResult();
//       em.close();
//       return moyenne;
//
//
//   }
	
	

}