package br.com.serratec.Model;

public class Laboratorio {
    private Integer idLaboratorio;
    private String nome;
    private String tipo;

    public Integer getIdLaboratorio() { return idLaboratorio; }
    public void setIdLaboratorio(Integer idLaboratorio) { this.idLaboratorio = idLaboratorio; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return "Id: " + idLaboratorio + "\nNome: " + nome + "\nTipo: " + tipo;
    }
}
