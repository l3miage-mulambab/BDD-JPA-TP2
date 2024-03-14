package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "projet")
public class ProjectEntity {
    @Id
    Integer id;
    String name;
    String description;
    @ManyToOne
    private DeveloperEntity developer;
}
