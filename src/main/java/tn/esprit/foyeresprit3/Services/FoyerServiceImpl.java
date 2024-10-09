package tn.esprit.foyeresprit3.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit3.Repositories.FoyerRepositories;
import tn.esprit.foyeresprit3.entité.Foyer;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService{

    FoyerRepositories fr;


    @Override
    public Foyer addFoyer(Foyer foyer) {
        return fr.save(foyer);
    }

    @Override
    public void deleteFoyer(Long idFoyer) {
fr.deleteById(idFoyer);
    }

    @Override
    public List<Foyer> getAllFoyer() {
        return fr.findAll();
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return fr.save(foyer);
    }

    @Override
    public Foyer findById(Long id){
        return fr.findById(id).get();
    }


}
