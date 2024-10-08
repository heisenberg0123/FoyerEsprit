package tn.esprit.foyeresprit3.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit3.Repositories.ChambreRepositories;
import tn.esprit.foyeresprit3.entité.Chambre;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService{

    ChambreRepositories chr;

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chr.save(chambre);
    }

    @Override
    public void deleteChambre(Long idChambre) {
chr.deleteById(idChambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return chr.findAll();
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chr.save(chambre);
    }
}
