package br.com.serratec.Model;

public class Medicamento {
    private Integer idMedicamento;
    private String nome;

    public Integer getIdMedicamento() { return idMedicamento; }
    public void setIdMedicamento(Integer idMedicamento) {this.idMedicamento = idMedicamento;}
    public String getNome() { return nome; }
    public void setNome(String nome) {this.nome = nome;}

    @Override
    public String toString() {
        return "Id: " + idMedicamento + " | Nome do medicamento: " + nome;
    }
}
