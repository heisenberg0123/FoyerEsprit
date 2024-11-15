package tn.esprit.foyeresprit3.Services;

import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.Etudiant;

import java.util.Date;
import java.util.List;
public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);

    void deleteEtudiant(Long idCEtudiant);
    List<Etudiant> getAllEtudiant();
    Etudiant updateEtudiant(Etudiant etudiant);

    Etudiant findById(Long id);

    List<Etudiant>getnometudiantbyanneeUniver(Date anneuniversite);



}
