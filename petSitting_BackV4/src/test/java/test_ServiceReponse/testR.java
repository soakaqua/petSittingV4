package test_ServiceReponse;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import model.Reponse;
import model.Service;
import repositories.ReponseRepository;
import repositories.ServiceRepository;

public class testR {

	@Test
	public void test() {
		
	}

	
	@Autowired
	private ReponseRepository reponseRepository;
	
	
	@Transactional
	@Test
	@Commit
	public void insertReponse() {
		Reponse r= new Reponse();
		r.setMessage("je suis motiv�e pour garder votre chien");
		r.setVersion(2);
		
		assertNotNull(reponseRepository.save(r));
		
	}
	
	//assertNotNull(serviceRepository.findById(s.getNumSer(100));
	
//	public void insertService () {
//		//faut commenter le getnumser pour que �a marche j pense que cest li� � la generated valu de l'Id numser
//
//		Service s= new Service();
//		s.setNomSer("GARDE CHAT");
//		s.setPrix(25);
//		serviceRepository.save(s); //le save=insert dans jparepository
//		}
	
	
	
	
	
}
