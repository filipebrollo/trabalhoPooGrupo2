package br.com.serratec.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Prescricao {
    private Atendimento atendimento;
    private Medicamento medicamento;
    private LocalDateTime dataHora;
    private BigDecimal dosagem;

    public Atendimento getAtendimento() { return atendimento; }
    public void setAtendimento(Atendimento atendimento) { this.atendimento = atendimento; }
    public Medicamento getMedicamento() { return medicamento; }
    public void setMedicamento(Medicamento medicamento) { this.medicamento = medicamento; }
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    public BigDecimal getDosagem() { return dosagem; }
    public void setDosagem(BigDecimal dosagem) { this.dosagem = dosagem; }

    @Override
    public String toString() {
        return "Id da Precrição: " + atendimento.getIdAtendimento() + "/" + medicamento.getIdMedicamento() +
                "\nData e Hora: " + dataHora + "\nDosagem: " + dosagem;
    }
}
