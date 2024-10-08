package tn.esprit.foyeresprit3.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit3.Repositories.BlocRepositorie;
import tn.esprit.foyeresprit3.entité.Bloc;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService{

    BlocRepositorie br;


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
}
