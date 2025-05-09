package com.example.cadastroninjas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name="tb_missions")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String difficulty;

    // @OneToMany - Missions can have multiple ninjas
    @OneToMany(mappedBy =  "missions")
    private List<Ninja> ninjas;
}
