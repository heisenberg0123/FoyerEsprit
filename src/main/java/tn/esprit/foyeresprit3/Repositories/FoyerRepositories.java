package tn.esprit.foyeresprit3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.Foyer;

import java.util.List;

@Repository
public interface FoyerRepositories extends JpaRepository<Foyer,Long> {
    @Query("SELECT f FROM Foyer f JOIN f.blocs b JOIN b.chambres c WHERE c.numeroChambre=:numero")
    List<Foyer>getfoyerparnumeroChambre(Long numero);
}
