package tn.esprit.foyeresprit3.entité;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBlock;
    private String nom;
    private Long capacitéBlock;


    @ManyToOne
            //(mappedBy="blocs")
    private Foyer foyer;

    @OneToMany
    Set<Chambre> chambres;

}
