package tn.esprit.foyeresprit3.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit3.Services.IBlocService;
import tn.esprit.foyeresprit3.Services.IChambreService;
import tn.esprit.foyeresprit3.entité.Bloc;
import tn.esprit.foyeresprit3.entité.Chambre;

import java.util.List;




@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {


    IBlocService blocService;



    // http://localhost:8089/tpfoyer/bloc/getallbloc
    @GetMapping("/getallbloc")
    public List<Bloc> getBloc() {
        List<Bloc> listBlocs = blocService.getAllBloc();
        return listBlocs;
    }


    // http://localhost:8089/tpfoyer/bloc/add-bloc
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }
    // http://localhost:8089/tpfoyer/bloc/remove-bloc/{bloc-id}
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long chId) {
        blocService.deleteBloc(chId);
    }
    // http://localhost:8089/tpfoyer/bloc/modify-bloc
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.updateBloc(b);
        return bloc;
    }


}
