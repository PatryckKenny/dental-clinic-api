package com.api.code.dominio;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PacienteRemovido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column
    private String nomeCompleto;

    @NotNull
    @Column
    private String email;

    @NotNull
    @Column
    private String cpf;

    @Column
    private String rg;

    @NotNull
    @Column
    private java.sql.Date dataNascimento;

    @NotNull
    @Column
    private String celular;

    @NotNull
    @Column
    private String genero;

    @NotNull
    @Column
    private String profissao;

    @Column
    private String telefoneFixo;

    @OneToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @NotNull
    @Column
    private Date dataRemosão;

//    @Column
//    private Long maiorIdade;
//
//    @Column
//    private Long idResponsavel;

    @OneToOne
    @JoinColumn(name = "id_responsavel")
    private Responsavel idResponsavel;

    @OneToOne
    @JoinColumn(name = "id_dentista")
    private Usuario idDentista;

    @Column
    private Long idDentistaResponsavel;

    @Column
    private String informacoesAdicionais;

}
