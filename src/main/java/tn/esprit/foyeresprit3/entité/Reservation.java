package tn.esprit.foyeresprit3.entité;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id

    private String idReservation;
    private Date anneUniversitaire;
    private Boolean estValide;
    @ManyToMany
    Set<Etudiant> etudiants;
}
