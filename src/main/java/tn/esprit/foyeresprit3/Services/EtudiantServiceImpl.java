package tn.esprit.foyeresprit3.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit3.Repositories.EtudiantRepositories;
import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.Etudiant;

import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{

   EtudiantRepositories et;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return et.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long idCEtudiant) {
et.deleteById(idCEtudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return et.findAll();
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return et.save(etudiant);
    }
}
