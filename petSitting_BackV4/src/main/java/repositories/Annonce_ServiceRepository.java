package repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import model.Annonce_Service;
import model.Annonce_ServicePK;

public interface Annonce_ServiceRepository extends JpaRepository<Annonce_Service, Annonce_ServicePK>  {
	
}
