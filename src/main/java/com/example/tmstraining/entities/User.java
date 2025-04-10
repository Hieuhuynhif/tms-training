package com.example.tmstraining.entities;

import com.example.tmstraining.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 2, max = 10)
    @NotNull
    @NotEmpty
    private String username;

    @Size(min = 2, max = 10)
    @NotEmpty
    @NotNull
    private String password;

    @Enumerated(EnumType.STRING)
    @Max(15)
    @NotNull
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;
}
