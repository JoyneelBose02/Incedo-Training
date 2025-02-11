package com.rental.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    private String id;

    private String roleId;
    private String role;

    @OneToOne
    @JoinColumn(name = "id")
    private User user;
}
