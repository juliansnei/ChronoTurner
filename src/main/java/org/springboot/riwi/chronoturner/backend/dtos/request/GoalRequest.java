package org.springboot.riwi.chronoturner.backend.dtos.request;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GoalRequest {

    @NotBlank(message = "name is required")
    private String name;


    private String description;

    private LocalDateTime startDate;

    @NotNull(message = "end date is required")
    private LocalDateTime endDate;

    //@NotBlank(message = "") resolver inquietud
    //private StatusGoal status;


}
