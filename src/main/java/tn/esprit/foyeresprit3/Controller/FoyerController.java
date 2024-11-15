package tn.esprit.foyeresprit3.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit3.Services.IChambreService;
import tn.esprit.foyeresprit3.Services.IFoyerService;
import tn.esprit.foyeresprit3.entité.Bloc;
import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.Foyer;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {


    IFoyerService foyerService;



    // http://localhost:8089/tpfoyer/foyer/listdesfoyer
    @GetMapping("/listdesfoyer")
    public List<Foyer> getFoyer() {
        List<Foyer> listFoyer = foyerService.getAllFoyer();
        return listFoyer;
    }


    // http://localhost:8089/tpfoyer/foyer/add-foyer
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.addFoyer(f);
        return foyer;
    }
    // http://localhost:8089/tpfoyer/foyer/remove-foyer/{foyer-id}
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long chId) {
        foyerService.deleteFoyer(chId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.updateFoyer(f);
        return foyer;
    }

    //http://localhost:8089/tpfoyer/foyer/retrieve-foyer/8
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long chId) {
        Foyer foyer = foyerService.findById(chId);
        return foyer;
    }


@GetMapping("/FoyerBynumeroChambre")
    public List<Foyer>getFoyerByNumeroChambre(Long numero){
        return foyerService.getFoyerBynumeroChambre(numero);
}

}
