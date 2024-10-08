package tn.esprit.foyeresprit3.Services;

import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit3.entité.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    void deleteChambre(Long idChambre);
    List<Chambre> getAllChambre();
    Chambre updateChambre(Chambre chambre);
}
