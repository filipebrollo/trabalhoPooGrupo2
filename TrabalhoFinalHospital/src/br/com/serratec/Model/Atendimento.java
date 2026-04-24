package br.com.serratec.Model;

import br.com.serratec.Enumerate.StatusAtendimento;
import br.com.serratec.Enumerate.TipoAtendimento;

import java.time.LocalDateTime;

public class Atendimento {
    private Integer idAtendimento;
    private LocalDateTime dataHora;
    private TipoAtendimento tipoAtendimento;
    private StatusAtendimento statusAtendimento;
    private String observacoes;
    private Medico medico;
    private Paciente paciente;

    public Integer getIdAtendimento() { return idAtendimento; }
    public void setIdAtendimento(Integer idAtendimento) { this.idAtendimento = idAtendimento; }
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    public TipoAtendimento getTipoAtendimento() { return tipoAtendimento; }

    public void setTipoAtendimento(TipoAtendimento tipoAtendimento) { this.tipoAtendimento = tipoAtendimento; }
    public StatusAtendimento getStatusAtendimento() { return statusAtendimento; }
    public void setStatusAtendimento(StatusAtendimento statusAtendimento) {  this.statusAtendimento = statusAtendimento; }
    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
    public Medico getMedico() { return medico; }
    public void setMedico(Medico medico) { this.medico = medico; }
    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    @Override
    public String toString() {
        return "id: " + idAtendimento + "\nData do Atendimento: " + dataHora +
                "\nTipo de Atendimento: " + tipoAtendimento + "\nStatus de atendimento: " + statusAtendimento +
                "\n Observações: " + observacoes + "\nMedico: " + medico + "\nPaciente: " + paciente;
    }
}
