package br.com.serratec.Model;

public class Paciente extends Pessoa{
    private Integer idPaciente;

    public Integer getIdPaciente() {
        return idPaciente;
    }
    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String getDescricao() {
        return "Id: " + idPaciente + " | Paciente: " + nome;
    }
}
