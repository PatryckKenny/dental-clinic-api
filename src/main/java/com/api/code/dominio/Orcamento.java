package com.api.code.dominio;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Orcamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @NotNull
    private String cpfPaciente;

    @Column
    @NotNull
    private String nomePaciente;

//    @Column
//    private Long idDentista;

    @OneToOne
    @JoinColumn(name = "id_dentista")
    private Usuario idDentista;
//
//    @Column
//    private Long idPaciente;

    @OneToOne
    @JoinColumn(name = "id_Paciente")
    private Paciente idPaciente;


    @Column
    private String observacao;

    @Column
    @NotNull
    private String tipoProcedimento;

    @Column
    @NotNull
    private String valor;

    @Column
    private String formaPagamento;

    @Column
    @NotNull
    private String dataOrcamento;
}
