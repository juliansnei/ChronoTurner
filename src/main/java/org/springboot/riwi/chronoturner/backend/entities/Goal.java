package org.springboot.riwi.chronoturner.backend.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springboot.riwi.chronoturner.backend.utils.enumGoal.StatusGoal;

import java.time.LocalDateTime;

@Entity
@Table(name = "goals")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Goal {
        //Atributos de Goal
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private StatusGoal status;
    private String user_id; //Un User, varias Goals --Cuidadongos con estas relaciones, establecer cardinalidad luego

    //Constructores de Goal
    //Asignadores de atributos de Goal (setters)
    //Lectores de atributos de Goal (getters)
    //Métodos de Goal

}
