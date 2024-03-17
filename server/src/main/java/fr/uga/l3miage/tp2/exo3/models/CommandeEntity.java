package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class CommandeEntity {
    @Id
    private Long id;
    private Date date;
    private double montantTotal;

    // Dans la table "commande_entity", on aura une colonne
    // qui renseigne l'id du client, donc on a une FK ici;
    // donc l'attribut mappedBy se trouve dans Client.
    @ManyToOne
    private ClientEntity client;
    @OneToMany(mappedBy = "commande")
    private Set<ProduitEntity> produits;
}
