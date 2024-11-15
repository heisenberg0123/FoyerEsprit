package tn.esprit.foyeresprit3.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit3.Repositories.ChambreRepositories;
import tn.esprit.foyeresprit3.entité.Bloc;
import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.TypeChambre;

import java.util.ArrayList;
import java.util.Date;
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


    public Chambre findById(Long id){
        return  chr.findById(id).get();
    }

    @Override
    public List<Chambre> findByBloc_Nom(String nom) {
        return chr.findByBloc_Nom(nom);
    }

    @Override
    public List<Chambre> findAllByTypeC(TypeChambre tc) {
       return  chr.findAllByTypeC(tc);
    }

    @Override
    public Chambre findByNumeroChambre(Long numeroChambre) {
       return chr.findByNumeroChambre(numeroChambre);
    }

    @Override
    public List<Chambre> getChambreByBlocAndAndTypeC(Bloc b, TypeChambre typeC) {
       return chr.getChambreByBlocAndTypeC(b, typeC);
    }

    @Override
    public Integer countByBloc_CapacitéBlockGreaterThan(Long capacite) {
        return chr.countByBloc_CapacitéBlockGreaterThan(capacite);
    }

    @Override
    public List<Chambre> findByBloc_NomQuery(String nomBloc) {
        return chr.findByBloc_NomQuery(nomBloc);
    }

    @Override
    public List<Chambre> findByAnneeDeResQuery(Date d1, Date d2) {
        return chr.findByAnneeDeResQuery(d1, d2);
    }



public  Integer countnombreChambre(Date anneuniversite){
        return chr.countnombreChambre(anneuniversite);
}
}
