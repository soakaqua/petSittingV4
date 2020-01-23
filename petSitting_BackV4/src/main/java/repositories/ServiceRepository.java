package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Service;



public interface ServiceRepository extends JpaRepository <Service, Integer>{

	
	
	
	
	
}
