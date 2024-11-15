package tn.esprit.foyeresprit3.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit3.Repositories.BlocRepositorie;
import tn.esprit.foyeresprit3.Repositories.ChambreRepositories;
import tn.esprit.foyeresprit3.entité.Bloc;
import tn.esprit.foyeresprit3.entité.Chambre;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService{

    BlocRepositorie br;
ChambreRepositories cc;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return br.save(bloc);
    }

    @Override
    public void deleteBloc(Long idBloc) {
br.deleteById(idBloc);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return br.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return br.save(bloc);
    }

    @Override
    public Bloc findById(Long id){
        return br.findById(id).get();
    }

public  Bloc affecterChambreaBloc(Long idBloc,List<Long>numChambre){
        Bloc b=br.findById(idBloc).get();
    List<Chambre> chambre=cc.findAllById(numChambre);

    b.getChambres().forEach(ch -> ch.setBloc(b));
     cc.saveAll(chambre);
     return b;

}
}
