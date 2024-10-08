package tn.esprit.foyeresprit3.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit3.Services.IChambreService;
import tn.esprit.foyeresprit3.Services.IReservationService;
import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.Reservation;

import java.util.List;





@RestController
@AllArgsConstructor
@RequestMapping("/reservation")

public class ReservationController {


    IReservationService reservationService;



    // http://localhost:8089/tpfoyer/reservation/retrieve-all-reservations
    @GetMapping("/retrieve-all-reservation")
    public List<Reservation> getReservation() {
        List<Reservation> listReservations = reservationService.getAllReservation();
        return listReservations;
    }


    // http://localhost:8089/tpfoyer/reservation/add-reservation
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationService.addReservation(r);
        return reservation;
    }
    // http://localhost:8089/tpfoyer/reservation/remove-reservation/{reservation-id}
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") String chId) {
        reservationService.deleteReservation(chId);

    }
    // http://localhost:8089/tpfoyer/reservation/modify-reservation
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation r) {
        Reservation res = reservationService.updateReservation(r);
        return res;
    }




}
