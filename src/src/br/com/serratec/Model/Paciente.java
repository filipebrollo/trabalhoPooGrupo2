package br.com.serratec.Model;

public class Paciente extends Pessoa{
    private Integer idPaciente;

    public Integer getId() {
        return idPaciente;
    }
    public void setId(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String getDescricao() {
        return "Id: " + idPaciente + " | Paciente: " + nome;
    }
}
