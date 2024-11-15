package tn.esprit.foyeresprit3.Repositories;

import org.apache.el.parser.AstGreaterThan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.foyeresprit3.entité.Bloc;
import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.TypeChambre;

import java.util.Date;
import java.util.List;

@Repository
public interface ChambreRepositories extends JpaRepository<Chambre,Long> {




    List<Chambre> findAllByTypeC(TypeChambre tc);
    Chambre findByNumeroChambre(Long numeroChambre);
    List<Chambre> getChambreByBlocAndTypeC(Bloc bloc, TypeChambre typeC);

   // List<Chambre> getChambreByBlocAndTypeC(long idBloc, TypeChambre typeC);

    List<Chambre> findByBloc_Nom(String nom);
    //Integer countByBloc_CapacitéBlockGreaterThan(Long capacite);
    Integer countByBloc_CapacitéBlockGreaterThan(Long capacite);


    @Query("SELECT c FROM Chambre c WHERE c.bloc.nom = ?1")
    List<Chambre> findByBloc_NomQuery(String nomBloc);


    @Query("select c From Chambre c Join c.r a  where a.anneUniversitaire between :d1 And :d2")
    List<Chambre> findByAnneeDeResQuery(@Param("d1") Date d1, @Param("d2") Date d2);



    @Query("SELECT COUNT(c) FROM Chambre c JOIN c.r r WHERE r.estValide=false AND r.anneUniversitaire<:d1")
    Integer countnombreChambre(@Param("d1") Date d1);


}
