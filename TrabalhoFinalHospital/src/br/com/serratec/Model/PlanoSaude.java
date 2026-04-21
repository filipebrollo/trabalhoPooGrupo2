package br.com.serratec.Model;

import br.com.serratec.Enumerate.NomePlano;

import java.time.LocalDate;

public class PlanoSaude {
    private Integer idPlano;
    private String telefone;
    private String cobertura;
    private LocalDate dataCredenciamento;
    private NomePlano nome;

    public Integer getIdPlano() { return idPlano; }
    public void setIdPlano(Integer idPlano) { this.idPlano = idPlano; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getCobertura() { return cobertura; }
    public void setCobertura(String cobertura) { this.cobertura = cobertura; }
    public LocalDate getDataCredenciamento() { return dataCredenciamento; }
    public void setDataCredenciamento(LocalDate dataCredenciamento) { this.dataCredenciamento = dataCredenciamento; }
    public NomePlano getNomePlano() { return nome; }
    public void setNomePlano(NomePlano nomePlano) { this.nome = nomePlano; }

    @Override
    public String toString() {
        return "Id: " + idPlano + " | Nome: " + nome + " | Telefone: " + telefone +
                " | Cobertura: " + cobertura + " | Data de Credenciamento: " + dataCredenciamento;
    }
}
