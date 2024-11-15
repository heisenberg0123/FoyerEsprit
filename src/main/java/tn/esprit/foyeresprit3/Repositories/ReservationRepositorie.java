package tn.esprit.foyeresprit3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.Reservation;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepositorie extends JpaRepository<Reservation,String> {

    List<Reservation>findByAnneUniversitaireBetween(Date d1,Date d2);}

