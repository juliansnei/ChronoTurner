package org.springboot.riwi.chronoturner.backend.dtos.response;

import lombok.*;
import org.springboot.riwi.chronoturner.backend.utils.enumGoal.StatusGoal;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class GoalResponse {

    //private String id;
    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private StatusGoal status;
}
