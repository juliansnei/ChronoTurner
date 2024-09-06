package org.springboot.riwi.chronoturner.backend.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springboot.riwi.chronoturner.backend.utils.taskEnums.enumSubTask.StatusSubTask;
import org.springboot.riwi.chronoturner.backend.utils.taskEnums.enumTask.StatusTask;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {
        //Atributos de Task
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String description;
    private LocalDateTime expirationDate;
    private StatusTask statusTask;
    private StatusSubTask statusSubTask;
    private String priorityID;  //Una Task, una Priority  --Cuidadongos con estas relaciones, establecer cardinalidad luego
    private String goalID;  //Un Goal, varias Task  --Cuidadongos con estas relaciones, establecer cardinalidad luego
    private String categoryID;  //Una Category, una Task  --Cuidadongos con estas relaciones, establecer cardinalidad luego
    private String userID;  //Un User, varias Task  --Cuidadongos con estas relaciones, establecer cardinalidad luego

    //Constructores de Task
    //Asignadores de atributos de Task (setters)
    //Lectores de atributos de Task (getters)
    //Métodos de Task
}
