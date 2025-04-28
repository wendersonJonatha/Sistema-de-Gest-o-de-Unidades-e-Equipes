package com.gestor360.gestor360.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {


    @Id
    @GeneratedValue
    private Long idUsuario;

    @Column(nullable = false, length = 20)
    private String nome;


    @Column(nullable = false, length = 50)
    private String sobreNome;

    @Column( unique = true, nullable = false, length =50 )
    private String email;

    @Column(nullable = false,length = 100)
    private String senha;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private  String cargo;

}
