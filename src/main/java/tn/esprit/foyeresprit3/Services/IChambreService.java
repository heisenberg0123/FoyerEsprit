package tn.esprit.foyeresprit3.Services;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit3.entité.Bloc;
import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.TypeChambre;

import java.util.Date;
import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    void deleteChambre(Long idChambre);
    List<Chambre> getAllChambre();
    Chambre updateChambre(Chambre chambre);

    Chambre findById(Long id);

    List<Chambre> findByBloc_Nom(String nom);


    //codi codi
    List<Chambre> findAllByTypeC(TypeChambre tc);
    Chambre findByNumeroChambre(Long numeroChambre);
    List<Chambre> getChambreByBlocAndAndTypeC(Bloc bloc, TypeChambre typeC);

    Integer countByBloc_CapacitéBlockGreaterThan(Long capacite);





    List<Chambre> findByBloc_NomQuery(String nomBloc);



    List<Chambre> findByAnneeDeResQuery(Date d1,Date d2);

Integer countnombreChambre(Date anneuniversite);

}
