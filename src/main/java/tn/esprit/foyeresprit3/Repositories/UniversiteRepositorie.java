package tn.esprit.foyeresprit3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.Universite;

import java.util.List;

@Repository
public interface UniversiteRepositorie extends JpaRepository<Universite,Long> {

   Universite findByNomUniversite(String nom);
}
