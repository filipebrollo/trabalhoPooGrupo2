package br.com.serratec.Model;

import java.time.LocalDate;

public class Internacao {

    private Paciente paciente;
    private Atendimento atendimento;
    private Leito nLeito;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Atendimento getAtendimento() {
        return atendimento;
    }
    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }
    public Leito getnLeito() {
        return nLeito;
    }
    public void setnLeito(Leito nLeito) {
        this.nLeito = nLeito;
    }
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public LocalDate getDataSaida() {
        return dataSaida;
    }
    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }
    @Override
    public String toString() {
        return "Paciente: " + paciente + " | Atendimento: " + atendimento + " | Número do leito: " + nLeito
                + " | Data de entrada: " + dataEntrada + " | Data de saída: " + dataSaida;
    }

    
    
    


}
