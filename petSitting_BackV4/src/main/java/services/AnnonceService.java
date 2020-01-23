package services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import model.Annonce;
import model.Annonce_Service;
import model.Reponse;
import model.Sitter;
import repositories.AnnonceRepository;

@Service
public class AnnonceService {
	
	@Autowired
	private static AnnonceRepository annonceRepository;
	
	public Annonce save(Annonce c) {
		
		//int numA, String titre, String message, Double noteP, Double noteS, int statut, int numC, Set<Annonce_Service>  annonce_service
		
		Annonce annonceEnBase = null;
		if(c.getNumA()!=0) {
			Optional<Annonce> opt = annonceRepository.findById(c.getNumC());
			annonceEnBase = opt.get();
			annonceEnBase.setTitre((c.getTitre()!=null)?c.getTitre():annonceEnBase.getTitre());
			annonceEnBase.setMessage((c.getMessage()!=null)?c.getMessage():annonceEnBase.getMessage());
			annonceEnBase.setNoteP((c.getNoteP()!=null)?c.getNoteP():annonceEnBase.getNoteP());
			annonceEnBase.setNoteS((c.getNoteS()!=null)?c.getNoteS():annonceEnBase.getNoteS());
			annonceEnBase.setNumC((c.getNumC()!=0)?c.getNumC():annonceEnBase.getNumC());
//			annonceEnBase.setAnnonce_service((c.getNumC()!=null)?c.getAnnonce_service():annonceEnBase.getAnnonce_service());
			annonceRepository.save(annonceEnBase);
			return annonceEnBase;
		}
		else {
			annonceRepository.save(c);
			return c;
		}
		
	}
		//-----------------------------METHODES--------------------------------------
		
//		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");
		
	public List<Annonce> afficherAnnoncesPubliees(Integer numC) {
		List<Annonce> list = annonceRepository.selectAnnonceByProprio(4);
		System.out.println(list);
		return list;
	}
		
	public static void publierContenuAnnonce(String titre, String message, int numC) { //probleme avec services
		Annonce a=new Annonce();
		a.setTitre(titre);
		a.setMessage(message);
		a.setNumC(numC);
		annonceRepository.save(a);
	}
	
	public static void publierServiceAnnonce(Annonce a, Set<Annonce_Service> annonce_service) { //probleme avec services
		a.setListService(annonce_service);
		//insert numero annonce_service 
		
		//insertion des services dans la table annonce_service
		
	}

	public static void modifierContenuAnnonce(int numA, String titre, String message) { 
		Annonce a=new Annonce();
		a.setNumA(a.getNumA());
		a.setTitre(titre);
		a.setMessage(message);
		a.setNoteP(a.getNoteP());
		a.setNoteS(a.getNoteS());
		a.setStatut(a.getStatut());
		a.setNumC(a.getNumC());
		a.setListService(a.getListService());
		annonceRepository.save(a);
	} 

	public static void modifierServicesAnnonce(Annonce a, Set<Annonce_Service> annonce_service) { //probleme avec les services
		a.setListService(annonce_service);
		annonceRepository.save(a);
	} 

	public void supprReponsesRefusees(Annonce a) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");
		int bonNumA=a.getNumA();
		List<Reponse> reponses = null;
		Query query = ctx.createQuery("from Reponse r where r.numA!=bonNumA");
		reponses = query.getResultList();
		for (int i=0; i<reponses.size(); i++)  
		{annonceRepository.delete(reponses.get(i)); }
		ctx.close();
	}

	public void validerSitter(Annonce a) {
		a.setStatut(1);
		annonceRepository.save(a);
		supprReponsesRefusees(a);
	}

	public int noterS(Double noteS, Annonce a, Sitter s) {
		//daoAnnonce.selectSittersByReponseValidee(a);
		List<Integer>liste=annonceRepository.selectNoteSitter(s);
		int somme=0;
		for (int i=0; i<liste.size(); i++)  
		{ somme+=liste.get(i);}
		int moyenne=somme/(liste.size());
		//			s.setNoteS(moyenne);
		return moyenne;
	}


	
	
}
