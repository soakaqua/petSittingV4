package test_gael;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import repositories.CompteRepository;
import services.CompteService;

@RunWith(SpringJUnit4ClassRunner.class) // implémenter spring
@ContextConfiguration(locations = {"/application-context.xml"}) //configurer spring
public class testCompteRepository {

	
	@Autowired
	private CompteRepository compteRepository2;
	@Autowired
	private CompteService compteService ;

	
//	@Test
//	public void testInsertEtFindById() {
//		Compte c = new Compte();
//		c.setNom("toto");
//		compteRepository.save(c);
//		Optional<Compte> opt = compteRepository.findById(100);
//		assertTrue(opt.isPresent());
//	}
	
	
//	@Test
//	public void testFindById() {
//		Compte c = new Compte();
//		c.setNom("toto");
//		compteRepository.save(c);
//		Optional<Compte> opt = compteRepository.findById(c.getNumC());
//		System.out.println(opt.get().getNom());
////		assertEquals("toto", .);
//	}
//	
//	@Test
//	public void testFindAll() {
//		List<Compte> lstC = null;
//		lstC = compteRepository2.findAll();
//		assertEquals(25, lstC.size());
//	}
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
//		Compte c = new Compte();
//		c.setNom("lupus");
//		
//		c = compteService.save(c);
//		System.out.println(c.getNom());
//		assertEquals("lupus", c.getNom());
//	}
//	
//	@Test
//	public void testCheckConnection() {
//		String mdp = "totopwd";
//		String mail = "loups.reed@gmail.com";
//		
//		Compte c = compteService.connection(mail, mdp);
//
//		assertEquals(100, c.getNumC(), 0);
//		
//	}
	

}
