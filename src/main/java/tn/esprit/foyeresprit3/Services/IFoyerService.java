package tn.esprit.foyeresprit3.Services;

import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.Etudiant;
import tn.esprit.foyeresprit3.entité.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);

    void deleteFoyer(Long idFoyer);
    List<Foyer> getAllFoyer();
    Foyer updateFoyer(Foyer foyer);
}
