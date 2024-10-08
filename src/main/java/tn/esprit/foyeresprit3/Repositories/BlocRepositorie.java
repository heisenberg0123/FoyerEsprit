package tn.esprit.foyeresprit3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyeresprit3.entité.Bloc;
import tn.esprit.foyeresprit3.entité.Chambre;

public interface BlocRepositorie extends JpaRepository<Bloc,Long> {
}
