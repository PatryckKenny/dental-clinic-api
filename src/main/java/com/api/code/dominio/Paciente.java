package com.api.code.dominio;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Paciente {

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
    private Date dataNascimento;

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

    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @Column
    private Boolean maiorIdade;

//    @Column
//    private Long idResponsavel;

    @OneToOne
    @JoinColumn(name = "id_responsavel")
    private Responsavel idResponsavel;

    //@Column
    //private Long idDentistaResponsavel;

    @OneToOne
    @JoinColumn(name = "id_dentista")
    private Usuario idDentista;

    @Column
    private String informacoesAdicionais;

}
