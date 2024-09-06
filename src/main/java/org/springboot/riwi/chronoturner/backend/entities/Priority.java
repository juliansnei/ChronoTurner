package org.springboot.riwi.chronoturner.backend.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springboot.riwi.chronoturner.backend.utils.enumPriority.Name;

@Entity
@Table(name = "priorities")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Priority {
        //Atributos de Priority
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Name name;
    private String description;

    //Constructores de Priority
    //Asignadores de atributos de Priority (setters)
    //Lectores de atributos de Priority (getters)
    //Métodos de Priority


}
