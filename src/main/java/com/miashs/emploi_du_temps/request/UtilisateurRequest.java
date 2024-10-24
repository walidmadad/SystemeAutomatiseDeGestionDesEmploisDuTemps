package com.miashs.emploi_du_temps.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UtilisateurRequest {
    private Long id;
    private String nom;
    private String prenom;
    private String telephone;
    private LocalDate dateNaissance;
    private String email;
    private String motDePasse;
}
