package repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import model.Annonce;

public interface AnnonceRepository extends JpaRepository<Annonce, Integer> {

}
