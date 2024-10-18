package com.miashs.emploi_du_temps.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private long capacite;
    private String typeSalle;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departement_id")
    private Departement departement;

    @JsonIgnore
    @OneToMany(mappedBy = "salle")
    private List<Cours> cours;

}