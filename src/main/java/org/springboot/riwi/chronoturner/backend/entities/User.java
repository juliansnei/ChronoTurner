package org.springboot.riwi.chronoturner.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springboot.riwi.chronoturner.backend.utils.enumUser.TypeUser;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
        //Atributos de CLASE
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime registrationDate;
    private LocalDateTime lastAccessDate;
    private TypeUser typeUser;

    //Constructores de CLASE
    //Asignadores de atributos de CLASE (setters)
    //Lectores de atributos de CLASE (getters)
    //Métodos de CLASE
}
