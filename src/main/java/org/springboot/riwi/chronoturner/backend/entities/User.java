package org.springboot.riwi.chronoturner.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springboot.riwi.chronoturner.backend.utils.enumUser.TypeUser;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime registrationDate;
    private LocalDateTime lastAccessDate;
    private TypeUser typeUser;
    @OneToMany(mappedBy = "userEntity")
    private List<Task> taskList;
    @OneToMany(mappedBy = "user")
    private List<Goal> goalList;

}
