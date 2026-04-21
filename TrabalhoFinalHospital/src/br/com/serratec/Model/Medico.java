package br.com.serratec.Model;

public class Medico extends Pessoa {
    private Integer crm;
    private String especialidade;

    public Integer getCrm() {
        return crm;
    }
    public void setCrm(Integer crm) {
        this.crm = crm;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String getDescricao() {
        return "Médico: " + nome + " | CRM: " +crm + " | Especialidade: " + especialidade;
    }
}
