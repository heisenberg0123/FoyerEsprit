package tn.esprit.foyeresprit3.Controller;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit3.Services.IChambreService;
import tn.esprit.foyeresprit3.entité.Bloc;
import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.Reservation;
import tn.esprit.foyeresprit3.entité.TypeChambre;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {
    IChambreService chambreService;



    // http://localhost:8089/tpfoyer/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.getAllChambre();
        return listChambres;
    }


    // http://localhost:8089/tpfoyer/chambre/add-chambre
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.deleteChambre(chId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.updateChambre(c);
        return chambre;
    }

    //http://localhost:8089/tpfoyer/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chId) {
        Chambre chambre = chambreService.findById(chId);
        return chambre;
    }













    //codi
    @GetMapping("/getAllChambreByTypeC")
    List<Chambre> findAllByTypeC(TypeChambre tc){
        return chambreService.findAllByTypeC(tc);
    }



    @GetMapping("/retrieve-chambreByNumero/{chambre-id}")
    Chambre findByNumeroChambre(@PathVariable("chambre-id") Long numeroChambre){
        return chambreService.findByNumeroChambre(numeroChambre);
    }
    @GetMapping("/getChambreByBlocAndTypeC")
    List<Chambre> getChambreByBlocAndAndTypeC(Bloc b, TypeChambre typeC){
       return chambreService.getChambreByBlocAndAndTypeC(b, typeC);



    }

    @GetMapping("/findByBlocNom")
    List<Chambre> findByBloc_Nom(@RequestParam String nom){
        return chambreService.findByBloc_Nom(nom);
    }



    @GetMapping("/great")
    Integer greatthan(@RequestParam Long capacite){
        return chambreService.countByBloc_CapacitéBlockGreaterThan(capacite);
    }




    @GetMapping("/date/")
    public List<Chambre> findByBloc_NomQuery(String nomBloc) {
        return chambreService.findByBloc_NomQuery(nomBloc);
    }

        @GetMapping("/date/{d1}/{d2}")
    public List<Chambre> findByAnneeDeResQuery(@PathVariable @DateTimeFormat(pattern = "yyy-mm-dd") Date d1, @PathVariable @DateTimeFormat(pattern = "yyy-mm-dd") Date d2){
        return chambreService.findByAnneeDeResQuery(d1, d2);
    }


@GetMapping("/nombreChambrevalide")
    public Integer countnombreChambre(Date anneuniversite){
        return chambreService.countnombreChambre(anneuniversite);
}


}









