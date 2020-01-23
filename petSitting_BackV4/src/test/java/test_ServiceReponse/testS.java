package test_ServiceReponse;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


import model.Service;
import repositories.ServiceRepository;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/application-context.xml"} )
public class testS {

	@Autowired
	private ServiceRepository serviceRepository;
	
	public void test() {
		
	}

	@Transactional //ça marche aussi sans transactional et commit
	@Test
    @Commit   
	public void insertService () {
		
		Service s= new Service();
		s.setNomSer("GARDE CHAT");
		s.setPrix(25);
		serviceRepository.save(s); //le save=insert dans jparepository
		}
	
	
//		Service s= new Service();
//		
//		assertNotNull(serviceRepository.findById(s.getNumSer(100));
	
	
	
	//	daoService.insert(s);	
//		ServiceRepository.insert(s);
//		assertNotNull(serviceRepository.findById(s.getNumSer()));
		
		
		//----- Test selectById --------c'est OKI!
//		DaoService daoService = DaoServiceFactory.getInstance();
//		Service s = new Service();
//        s =daoService.selectById(100); //class.methode
//        System.out.println(s);
		
		
		
		
	}
	

	


//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"/application-context.xml"} )
//public class TestDaoSalle {
//
//	@Autowired
//	private DaoSalle daoSalle;
//	
//	
//	@Test
//	@Transactional
//	//@Rollback
//	public void insertSalle() {
//		
//		Salle s=new Salle ("aaaa");
//		daoSalle.insert(s);
//		assertNotNull(daoSalle.findByKey(s.getNom()));
//
//	}
//	
////	@Test
////	public void test() {
////	assertNotNull(daoSalle);
////	}
//
//	@Test(expected = EmptyResultDataAccessException.class)
//	public void findAAA() {
//		
//		daoSalle.findByKeyWithPersonnes("aaa");
//	}
//	