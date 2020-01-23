package services;

import org.springframework.stereotype.Service;

@Service
public class SitterService {
 
	
	
	
	
	
	
	
}
//@Service
//public class AnnonceService {
//	
//	@Autowired
//	private static AnnonceRepository annonceRepository;
//	
//	public Annonce save(Annonce c) {
//		
//		//int numA, String titre, String message, Double noteP, Double noteS, int statut, int numC, Set<Annonce_Service>  annonce_service
//		
//		Annonce annonceEnBase = null;
//		if(c.getNumA()!=0) {
//			Optional<Annonce> opt = annonceRepository.findById(c.getNumC());
//			annonceEnBase = opt.get();
//			annonceEnBase.setTitre((c.getTitre()!=null)?c.getTitre():annonceEnBase.getTitre());
//			annonceEnBase.setMessage((c.getMessage()!=null)?c.getMessage():annonceEnBase.getMessage());
//			annonceEnBase.setNoteP((c.getNoteP()!=null)?c.getNoteP():annonceEnBase.getNoteP());
//			annonceEnBase.setNoteS((c.getNoteS()!=null)?c.getNoteS():annonceEnBase.getNoteS());
//			annonceEnBase.setNumC((c.getNumC()!=0)?c.getNumC():annonceEnBase.getNumC());
////			annonceEnBase.setAnnonce_service((c.getNumC()!=null)?c.getAnnonce_service():annonceEnBase.getAnnonce_service());
//			annonceRepository.save(annonceEnBase);
//			return annonceEnBase;
//		}
//		else {
//			annonceRepository.save(c);
//			return c;
//		}
//		
//	}