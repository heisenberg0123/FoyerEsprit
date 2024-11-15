package tn.esprit.foyeresprit3.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit3.Repositories.FoyerRepositories;
import tn.esprit.foyeresprit3.Repositories.UniversiteRepositorie;
import tn.esprit.foyeresprit3.entité.Foyer;
import tn.esprit.foyeresprit3.entité.Universite;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{


    UniversiteRepositorie ur;
    FoyerRepositories fo;
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

    public Universite affecterFoyeraUniver(Long id,String nomUniver){
        Foyer  f = fo.findById(id).get();
      Universite uni=ur.findByNomUniversite(nomUniver);
uni.setF(f);
return ur.save(uni);
    }

    public Universite desaffecterFoyer(Long id){
        Universite uni=ur.findById(id).get();
        uni.setF(null);
        return  ur.save(uni);

    }



}
