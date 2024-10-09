package tn.esprit.foyeresprit3.Services;

import tn.esprit.foyeresprit3.entité.Foyer;
import tn.esprit.foyeresprit3.entité.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);

    void deleteUniversite(Long idFUniversite);
    List<Universite> getAllUniversite();
    Universite updateUniversite(Universite universite);

    Universite findById(Long id);

}
