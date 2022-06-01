package com.api.code.dto;

import com.api.code.dominio.Atendimento;
import com.api.code.dominio.Paciente;
import com.api.code.dominio.Usuario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class NovoAtendimentoDTO {

    private String cpfPaciente;
    private Long idDentista;
    private String observacao;
    private Date dataAtendimento;
    private LocalTime horario;
    private String local;

    public Atendimento toAtendimento(Paciente paciente, Usuario usuario){
        Atendimento atendimento = new Atendimento();

        atendimento.setCpfPaciente(paciente.getCpf());
        atendimento.setIdDentista(usuario);
        atendimento.setObservacao(observacao);
        atendimento.setDataAtendimento(dataAtendimento);
        atendimento.setHorario(horario);
        atendimento.setLocal(local);

        return atendimento;

    }

}
