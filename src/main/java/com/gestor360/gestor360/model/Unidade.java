package com.gestor360.gestor360.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Unidade")
public class Unidade {

    @Id
    @GeneratedValue
    private Long idUnidade;

    @NotNull(message = "O nome não pode ser nulo")
    @Column( unique = true, nullable = false, length =50 )
    private String nomeUnidade;

    @NotNull(message = "O nome não pode ser nulo")
    @Column(nullable = false, length = 50)
    private String cidade;

    @NotNull(message = "O nome não pode ser nulo")
    @Column(nullable = false, length = 50)
    private  String estado;

}
