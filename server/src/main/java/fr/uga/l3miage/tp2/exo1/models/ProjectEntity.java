package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;

@Entity
@Table(name = "projet")
public class ProjectEntity {
    @Id
    BigInteger id;
    String name;
    String description;
    @ManyToMany
    private Set<DeveloperEntity> developers;
}
