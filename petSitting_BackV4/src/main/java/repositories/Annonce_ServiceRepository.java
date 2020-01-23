package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Annonce;

public interface Annonce_ServiceRepository extends JpaRepository<Annonce, Integer>  {

}
