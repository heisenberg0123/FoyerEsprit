package tn.esprit.foyeresprit3.Services;

import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit3.entité.Foyer;
import tn.esprit.foyeresprit3.entité.Reservation;

import java.util.List;


public interface IReservationService {
    Reservation addReservation(Reservation reservation);

    void deleteReservation(String idReservation);
    List<Reservation> getAllReservation();
    Reservation updateReservation(Reservation reservation);
}
