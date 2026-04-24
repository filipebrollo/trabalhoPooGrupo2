package br.com.serratec.Model;
import br.com.serratec.Enumerate.ResultadoExame;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Exame {
    private Integer idExame;
    private String tipo;
    private BigDecimal custo;
    private String descricao;
    private ResultadoExame resultado;
    private LocalDateTime dataSolicitacao;
    private LocalDateTime dataResultado;
    private Medico medico;
    private Paciente paciente;
    private Laboratorio laboratorio;
    private Atendimento atendimento;

    public Integer getIdExame() {return idExame; }
    public void setIdExame(Integer idExame) { this.idExame = idExame; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public BigDecimal getCusto() { return custo; }
    public void setCusto(BigDecimal custo) { this.custo = custo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public ResultadoExame getResultado() { return resultado; }
    public void setResultado(ResultadoExame resultado) { this.resultado = resultado; }
    public LocalDateTime getDataSolicitacao() { return dataSolicitacao; }
    public void setDataSolicitacao(LocalDateTime dataSolicitacao) { this.dataSolicitacao = dataSolicitacao; }
    public LocalDateTime getDataResultado() { return dataResultado; }
    public void setDataResultado(LocalDateTime dataResultado) { this.dataResultado = dataResultado; }
    public Medico getMedico() { return medico; }
    public void setMedico(Medico medico) { this.medico = medico; }
    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    public Laboratorio getLaboratorio() { return laboratorio; }
    public void setLaboratorio(Laboratorio laboratorio) {  this.laboratorio = laboratorio; }
    public Atendimento getAtendimento() { return atendimento; }
    public void setAtendimento(Atendimento atendimento) { this.atendimento = atendimento; }

    @Override
    public String toString() {
        return "Id: " + idExame + "\nTipo de exame: " + tipo + "\nValor: " + custo +
                "\nDescrição: " + descricao + "\nResultado: " + resultado + "\nData da Solicitação: " + dataSolicitacao +
                "\nData do resultado: " + dataResultado + "\nMedico: "  + medico + "\nPaciente: " + paciente +
                "\nLaboratorio: " + laboratorio + "\nAtendimento: " + atendimento;
    }
}
