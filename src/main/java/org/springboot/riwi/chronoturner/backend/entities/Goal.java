package org.springboot.riwi.chronoturner.backend.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springboot.riwi.chronoturner.backend.utils.enumGoal.StatusGoal;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "goals")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String description;

    @Column(nullable=false)
    private LocalDateTime startDate;

    @Column(nullable=false)
    private LocalDateTime endDate;

    @Enumerated(EnumType.STRING)
    private StatusGoal status;

    @OneToMany(mappedBy = "goalEntity")
    private List<Task> taskList;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

    @PrePersist
    public void GoalCreation() {
        if (this.startDate == null) {
            this.startDate = LocalDateTime.now();
        }
        this.status=StatusGoal.STARTED;
    }

}
