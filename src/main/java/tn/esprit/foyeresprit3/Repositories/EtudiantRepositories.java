package tn.esprit.foyeresprit3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.foyeresprit3.entité.Chambre;
import tn.esprit.foyeresprit3.entité.Etudiant;
import tn.esprit.foyeresprit3.entité.Reservation;

import java.util.Date;
import java.util.List;

@Repository
public interface EtudiantRepositories extends JpaRepository<Etudiant,Long> {
    @Query("SELECT e.nomEt FROM Etudiant e JOIN e.reservations r WHERE r.estValide=true AND r.anneUniversitaire=:d1 ")
    List<Etudiant> getnometudiantbyanneeUniver(@Param("d1") Date d1);
}

