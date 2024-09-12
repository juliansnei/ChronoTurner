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

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private LocalDateTime expirationDate;
    private StatusTask statusTask;
    private StatusSubTask statusSubTask;

    @ManyToOne
    @JoinColumn(name = "priority_id")
    private Priority priorityEntity;
    @ManyToOne
    @JoinColumn(name = "goal_id")
    private Goal goalEntity;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categoryEntity;
    @ManyToOne
    @JoinColumn(name = "")
    private User userEntity;
}
