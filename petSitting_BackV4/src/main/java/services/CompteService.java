package services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Compte;
import repositories.CompteRepository;

@Service
public class CompteService {
	
	@Autowired
	private CompteRepository compteRepository;
	
	public Compte save(Compte c) {
		
		Compte compteEnBase = null;
		if(c.getNumC()!=null) {
			Optional<Compte> opt = compteRepository.findById(c.getNumC());
			compteEnBase = opt.get();
			compteEnBase.setCp((c.getCp()!=null)?c.getCp():compteEnBase.getCp());
			compteEnBase.setMail((c.getMail()!=null)?c.getMail():compteEnBase.getMail());
			compteEnBase.setMdpC((c.getMdpC()!=null)?c.getMdpC():compteEnBase.getMdpC());
			compteEnBase.setNom((c.getNom()!=null)?c.getNom():compteEnBase.getNom());
			compteEnBase.setPrenom((c.getPrenom()!=null)?c.getPrenom():compteEnBase.getPrenom());
			compteRepository.save(compteEnBase);
			return compteEnBase;
		}
		else {
			compteRepository.save(c);
			return c;
		
			
			
				
				
				
//             public Annonce save(Annonce c) {
//								
//				Annonce annonceEnBase = null;
//				if(c.getNumA()!=0) {
//					Optional<Annonce> opt = annonceRepository.findById(c.getNumC());
//					annonceEnBase = opt.get();
//					annonceEnBase.setTitre((c.getTitre()!=null)?c.getTitre():annonceEnBase.getTitre());
//					annonceEnBase.setMessage((c.getMessage()!=null)?c.getMessage():annonceEnBase.getMessage());
//					annonceEnBase.setNoteP((c.getNoteP()!=null)?c.getNoteP():annonceEnBase.getNoteP());
//					annonceEnBase.setNoteS((c.getNoteS()!=null)?c.getNoteS():annonceEnBase.getNoteS());
//					annonceEnBase.setNumC((c.getNumC()!=0)?c.getNumC():annonceEnBase.getNumC());
//					annonceEnBase.setAnnonce_service((c.getNumC()!=null)?c.getAnnonce_service():annonceEnBase.getAnnonce_service());
//					annonceRepository.save(annonceEnBase);
//					return annonceEnBase;
//				}
//				else {
//					annonceRepository.save(c);
//					return c;
//				}	
			
			
			
			
			
			
			
			
			
			
			
//			boolean erreur = false;
//			if(c.getMail()==null) {
//				erreur = true;
//			}
//			if(c.getMdpC()==null) {
//				erreur = true;
//			}
		}
		
		
		
		

		
	}
	
	
}
