package org.springboot.riwi.chronoturner.backend.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springboot.riwi.chronoturner.backend.utils.enumPriority.Name;

import java.util.List;

@Entity
@Table(name = "priorities")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Priority {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Name name;
    private String description;
    @OneToMany(mappedBy = "priorityEntity")
    private List<Task> taskList;



}
