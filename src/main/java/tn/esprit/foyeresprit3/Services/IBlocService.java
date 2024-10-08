package tn.esprit.foyeresprit3.Services;

import tn.esprit.foyeresprit3.entité.Bloc;
import tn.esprit.foyeresprit3.entité.Chambre;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    void deleteBloc(Long idBloc);
    List<Bloc> getAllBloc();
    Bloc updateBloc(Bloc bloc);
}
