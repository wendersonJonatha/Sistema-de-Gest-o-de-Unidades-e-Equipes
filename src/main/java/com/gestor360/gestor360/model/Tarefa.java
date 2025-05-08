package com.gestor360.gestor360.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Tarefas")
public class Tarefa {

    @Id
    @GeneratedValue
    private Long idTarefa;

    @Column (nullable = false, length = 50)
    private String titulo;

    @Lob
    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private LocalDateTime prazo;


    private Boolean finalizada = false;

    @Column(nullable = true)
    private LocalDateTime dataConclusao;
}
