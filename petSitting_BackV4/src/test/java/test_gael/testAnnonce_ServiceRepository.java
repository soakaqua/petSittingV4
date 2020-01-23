package test_gael;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.Annonce;
import model.Annonce_Service;
import model.Service;
import repositories.AnnonceRepository;
import repositories.ServiceRepository;
import services.AnnonceService2;

@RunWith(SpringJUnit4ClassRunner.class) // implémenter spring
@ContextConfiguration(locations = {"/application-context.xml"}) //configurer spring
public class testAnnonce_ServiceRepository {

	
	@Autowired
	private repositories.Annonce_ServiceRepository Annonce_ServiceRepository;
	@Autowired
	private AnnonceRepository annonceRepository ;
	@Autowired
	private ServiceRepository serviceRepository;
	@Autowired
	private AnnonceService2 AnnonceService;
	
//	@Test
//	public void testSaveFromService() {
//		Optional<Compte> opt = compteRepository2.findById(100);
//		Compte c = opt.get();
//		c.setNom("loups");
//		
//		Compte c2 = compteService.save(c);
//		System.out.println(c2.getNom());
//		assertEquals("loups", c2.getNom());
//	}
	
	@Test
	public void testSaveFromService2() {
		Annonce a = new Annonce();
		Optional<Annonce> opt = annonceRepository.findById(100);
		a =  opt.get();
		
		Service s = new Service();
		Optional<Service> opt2 = serviceRepository.findById(1);
		s = opt2.get();
				
		Annonce_Service aS = new Annonce_Service();
		
		aS= AnnonceService.save(a,s);
		System.out.println(aS);
		
//		System.out.println(aS.getNom());
//		assertEquals("lupus", c.getNom());
	}
	

}
