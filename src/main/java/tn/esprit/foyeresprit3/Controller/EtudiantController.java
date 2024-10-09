package tn.esprit.foyeresprit3.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit3.Services.IChambreService;
import tn.esprit.foyeresprit3.Services.IEtudiantService;
import tn.esprit.foyeresprit3.entité.Bloc;
import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {



    IEtudiantService etudiantService;



    // http://localhost:8089/tpfoyer/etudiant/retrieve-all-etudiant
    @GetMapping("/retrieve-all-etudiant")
    public List<Etudiant> getEtudiant() {
        List<Etudiant> listEtudiants = etudiantService.getAllEtudiant();
        return listEtudiants;
    }


    // http://localhost:8089/tpfoyer/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e1) {
        Etudiant e = etudiantService.addEtudiant(e1);
        return e;
    }
    // http://localhost:8089/tpfoyer/etudiant/remove-etudiant/{etudiant-id}
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudinat(@PathVariable("etudiant-id") Long chId) {
        etudiantService.deleteEtudiant(chId);
    }
    // http://localhost:8089/tpfoyer/etudiant/modify-etudiant
    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant c) {
        Etudiant e = etudiantService.updateEtudiant(c);
        return e;
    }

    //http://localhost:8089/tpfoyer/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long chId) {
        Etudiant etudiant = etudiantService.findById(chId);
        return etudiant;
    }


}
