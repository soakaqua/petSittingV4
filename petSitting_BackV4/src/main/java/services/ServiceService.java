package services;

import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Compte;
import repositories.ServiceRepository;

@Service
public class ServiceService {
 
	
	@Autowired
	private static ServiceRepository servicerepository;
	
	
	
 public Service save(Service s) {
		
	Service serviceEnBase=null;
	if (s.getNumSer()!=null) {
	Optional<Service>opt=servicerepository.findById(s.getNumSer());
	serviceEnBase=opt.get();
	serviceEnBase.setNomSer((s.getNomSer()!=null)?s.getNomSer():serviceEnBase.getNomSer());
	serviceEnBase.setPrix((s.getPrix()!=null)?s.getPrix():serviceEnBase.getPrix());
	serviceRepository.save(serviceEnBase);
	return serviceEnBase;
		}
		
		else
		{
			serviceRepository.save(s);
			return s;
		}
}

 //@Id
//	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqService")
//	private Integer numSer;
//	@Column (length = 500, nullable=false)
//	private String nomSer;
//	@Column (length = 5, nullable=false)
//	double prix;
//	@Version
//	private int version;
//public Compte save(Compte c) {
//	
//	Compte compteEnBase = null;
//	if(c.getNumC()!=null) {
//		Optional<Compte> opt = compteRepository.findById(c.getNumC());
//		compteEnBase = opt.get();
//		compteEnBase.setCp((c.getCp()!=null)?c.getCp():compteEnBase.getCp());
//		compteEnBase.setMail((c.getMail()!=null)?c.getMail():compteEnBase.getMail());
//		compteEnBase.setMdpC((c.getMdpC()!=null)?c.getMdpC():compteEnBase.getMdpC());
//		compteEnBase.setNom((c.getNom()!=null)?c.getNom():compteEnBase.getNom());
//		compteEnBase.setPrenom((c.getPrenom()!=null)?c.getPrenom():compteEnBase.getPrenom());
//		compteRepository.save(compteEnBase);
//		return compteEnBase;
//	}
//	else {
//		compteRepository.save(c);
//		return c;
////@Service
////public class AnnonceService {
////	
////	@Autowired
////	private static AnnonceRepository annonceRepository;
////	
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
//			annonceEnBase.setAnnonce_service((c.getNumC()!=null)?c.getAnnonce_service():annonceEnBase.getAnnonce_service());
//			annonceRepository.save(annonceEnBase);
//			return annonceEnBase;
//		}
//		else {
//			annonceRepository.save(c);
//			return c;
//		}
////		
////	}