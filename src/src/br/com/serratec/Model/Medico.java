package br.com.serratec.Model;

public class Medico extends Pessoa {
    private Integer crm;
    private String espcialidade;

    public Integer getCrm() {
        return crm;
    }
    public void setCrm(Integer crm) {
        this.crm = crm;
    }
    public String getEspcialidade() {
        return espcialidade;
    }
    public void setEspcialidade(String espcialidade) {
        this.espcialidade = espcialidade;
    }

    @Override
    public String getDescricao() {
        return "Médico: " + nome + " | CRM: " +crm;
    }
}
