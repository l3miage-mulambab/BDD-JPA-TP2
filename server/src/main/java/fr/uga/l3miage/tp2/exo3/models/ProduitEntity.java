package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProduitEntity {
    @Id
    private Long id;
    private String nom;
    private double prix;
    private Integer quantite;

    // La clé étrangère se trouve ici, c'est-à-dire que
    // la table "produit_entity" contient une colonne
    // qui fait référence à une commande
    @ManyToOne
    private CommandeEntity commande;
}