package tn.esprit.foyeresprit3.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit3.Repositories.ReservationRepositorie;
import tn.esprit.foyeresprit3.entité.Reservation;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService{


    ReservationRepositorie rr;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return rr.save(reservation);
    }

    @Override
    public void deleteReservation(String idReservation) {
rr.deleteById(idReservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return rr.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return rr.save(reservation);
    }
}