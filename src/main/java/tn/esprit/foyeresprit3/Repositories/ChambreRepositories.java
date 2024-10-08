package tn.esprit.foyeresprit3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyeresprit3.entité.Chambre;

@Repository
public interface ChambreRepositories extends JpaRepository<Chambre,Long> {






}
