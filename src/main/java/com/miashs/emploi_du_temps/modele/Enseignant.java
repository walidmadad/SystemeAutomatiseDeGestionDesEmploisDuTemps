package com.miashs.emploi_du_temps.modele;

import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Enseignant {
    private long id;
    private String nom;
    private String prenom;
    private Date date_joining;
    private String email;
    private String mdp;

    @OneToMany(mappedBy = "Enseignant")
    List<Enseignant> enseignants;
}