package test_marion;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import model.Annonce;
import repositories.AnnonceRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/application-context.xml"})
public class TestDaoAnnonce {
	
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");
	
	@Autowired
	private AnnonceRepository annonceRepository;

//	@NamedQuery(name="Annonce.selectAllWithStatut0",query="select a from Annonce a where a.statut=0")}) 
    
    //@Test
    public void testSelectAnnonceByProprio() {
    	List<Annonce> list = annonceRepository.selectAnnonceByProprio(4);
        System.out.println(list);
    }
	
    //@Test
    public void testAfficherAnnoncesTerminees() {
    	List<Annonce> list = annonceRepository.afficherAnnoncesTerminees(11);
        System.out.println(list);
    }
    
    //@Test
    public void testSelectAnnonceBySitter() {
    	List<Annonce> list = annonceRepository.selectAnnonceBySitter(101);
        System.out.println(list);
    }
    
    //@Test
    public void testSelectAllWithStatut0() {
    	List<Annonce> list = annonceRepository.selectAllWithStatut0();
        System.out.println(list);
    }
	
    //@Test
    @Transactional
    @Commit
    //@Rollback(true)
    public void insertAnnonce() {
        Annonce s=new Annonce();
        s.setTitre("titre super long pour le voir rapidement");
        s.setMessage("message inintéressant dont on se fiche");
        annonceRepository.save(s);
        //assertNotNull(s.getNumA());
        System.out.println(s.getNumA());
        assertNotNull(annonceRepository.findById(s.getNumA()));
    }
  
    
    //@Test
    @Transactional
    @Commit
    //@Rollback(true)
    public void updateAnnonce() {
    	Optional<Annonce> s = annonceRepository.findById(125);
    	Annonce s2=s.get(); //On récupère l'objet
        s2.setTitre("titre 2");
        s2.setMessage("message 2");
        annonceRepository.save(s2);
        System.out.println(s2.getNumA());
        assertNotNull(annonceRepository.findById(s2.getNumA()));
    }
    
    

}
