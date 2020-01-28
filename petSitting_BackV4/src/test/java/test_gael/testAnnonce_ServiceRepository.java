package test_gael;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.Annonce;
import model.Annonce_Service;
import model.Annonce_ServicePK;
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
	
//	@Test
//	public void testSaveFromService2() {
//		Annonce a = new Annonce();
//		Optional<Annonce> opt = annonceRepository.findById(100);
//		a =  opt.get();
//		
//		Service s = new Service();
//		Optional<Service> opt2 = serviceRepository.findById(1);
//		s = opt2.get();
//				
//		Annonce_Service aS = new Annonce_Service();
//		
//		aS= AnnonceService.save(a,s);
//		System.out.println(aS);
//
//	}
//	
//	@Test
//	public void testInsertServiceAnnonce() {
//		Annonce a = new Annonce();
//		Optional<Annonce> opt = annonceRepository.findById(101);
//		a= opt.get();
//		Set<Annonce_Service> annonce_services = new HashSet<Annonce_Service>() ;
//		Service s1 = serviceRepository.findById(1).get();
//		Service s2 = serviceRepository.findById(2).get();
//		Service s3 = serviceRepository.findById(4).get();
//
//		Annonce_ServicePK aSPK1= new Annonce_ServicePK(a, s1);
//		Annonce_ServicePK aSPK2= new Annonce_ServicePK(a, s2);
//		Annonce_ServicePK aSPK3= new Annonce_ServicePK(a, s3);
//		
//		Annonce_Service aS1 = new Annonce_Service();
//		aS1.setKey(aSPK1);
//		Annonce_Service aS2 = new Annonce_Service();
//		aS2.setKey(aSPK2);
//		Annonce_Service aS3 = new Annonce_Service();
//		aS3.setKey(aSPK3);
//		
//		annonce_services.add(aS1);
//		annonce_services.add(aS2);
//		annonce_services.add(aS3);
//
//		System.out.println(annonce_services);
//		AnnonceService.publierServiceAnnonce(a, annonce_services);
//	}
}
