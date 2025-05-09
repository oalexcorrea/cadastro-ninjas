package com.example.cadastroninjas.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="tb_ninjas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    @Column(unique=true)
    private String email;

    private String imgUrl;

    private String gender;

    private String rank;


    // @ManyToOne - A ninja can only have one mission per time
    @ManyToOne
    @JoinColumn(name = "missions_id") // Foreign Key
    private Mission missions;

}
