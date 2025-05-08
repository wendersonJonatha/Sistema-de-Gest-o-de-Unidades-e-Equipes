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
@Table(name = "Metas")
public class Meta {

    @Id
    @GeneratedValue
    private Long idMeta;

    @Lob
    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private LocalDateTime prazo;

    @Column(nullable = false)
    private boolean concluida;
}
