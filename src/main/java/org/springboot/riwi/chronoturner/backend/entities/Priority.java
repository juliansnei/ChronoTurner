package org.springboot.riwi.chronoturner.backend.entities;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springboot.riwi.chronoturner.backend.utils.EnumPriority.Name;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Priority {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private Name name;

    private String description;

}
