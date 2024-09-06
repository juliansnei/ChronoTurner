package org.springboot.riwi.chronoturner.backend.entities;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springboot.riwi.chronoturner.backend.utils.EnumGoal.StatusGoal;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String description;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private StatusGoal status;

    private String user_id;


}
