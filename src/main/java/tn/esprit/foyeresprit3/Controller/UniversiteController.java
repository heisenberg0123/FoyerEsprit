package tn.esprit.foyeresprit3.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit3.Services.IUniversiteService;
import tn.esprit.foyeresprit3.entité.Universite;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class UniversiteController {

    IUniversiteService universiteService;



    // http://localhost:8089/tpfoyer/universite/listdesfuniversite
    @GetMapping("/listdesuniversite")
    public List<Universite> getUniversite() {
        List<Universite> listUniversite = universiteService.getAllUniversite();
        return listUniversite;
    }


    // http://localhost:8089/tpfoyer/universite/add-universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite u1 = universiteService.addUniversite(u);
        return u1;
    }
    // http://localhost:8089/tpfoyer/universite/remove-universite/{universite-id}
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long chId) {
        universiteService.deleteUniversite(chId);
    }
    // http://localhost:8089/tpfoyer/universite/modify-universite
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.updateUniversite(u);
        return universite;
    }


    //http://localhost:8089/tpfoyer/universite/retrieve-universite/8
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long chId) {
        Universite universite = universiteService.findById(chId);
        return universite;
    }




}
