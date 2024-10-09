package tn.esprit.foyeresprit3.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit3.Repositories.UniversiteRepositorie;
import tn.esprit.foyeresprit3.entité.Universite;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{


    UniversiteRepositorie ur;
    @Override
    public Universite addUniversite(Universite universite) {
        return ur.save(universite);
    }

    @Override
    public void deleteUniversite(Long idFUniversite) {
ur.deleteById(idFUniversite);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return ur.findAll();
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return ur.save(universite);
    }


    @Override
    public Universite findById(Long id){
        return ur.findById(id).get();
    }

}
