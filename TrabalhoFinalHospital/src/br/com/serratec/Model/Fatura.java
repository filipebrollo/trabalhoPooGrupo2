package br.com.serratec.Model;

import br.com.serratec.Enumerate.FormaPagamento;
import br.com.serratec.Enumerate.StatusFatura;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Fatura {

    private Integer idFatura; 
    private BigDecimal valor;
    private StatusFatura status;
    private Paciente paciente;
    private LocalDate dataEmissao;
    private LocalDate dataVencimento;
    private FormaPagamento formaPagamento;
    private PlanoSaude plano;
    private Cnpj cnpj;

        public Fatura(Integer idFatura, BigDecimal valor, StatusFatura status, Paciente paciente, LocalDate dataEmissao,
        LocalDate dataVencimento, FormaPagamento formaPagamento, PlanoSaude plano, Cnpj cnpj) {
        this.idFatura = idFatura;
        this.valor = valor;
        this.status = status;
        this.paciente = paciente;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.formaPagamento = formaPagamento;
        this.plano = plano;
        this.cnpj = cnpj;
    }

    public Fatura() {}

    public Integer getIdFatura() {
        return idFatura;
    }
    public void setIdFatura(Integer idFatura) {
        this.idFatura = idFatura;
    }
    public BigDecimal getValor() { return valor; }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public StatusFatura getStatus() {return status; }
    public void setStatus(StatusFatura status) { this.status = status; }
    public Paciente getPaciente() {
        return paciente;
    }


    
    public LocalDate getDataEmissao() { return dataEmissao; }
    public void setDataEmissao(LocalDate dataEmissao) {  this.dataEmissao = dataEmissao; }
    public LocalDate getDataVencimento() { return dataVencimento; }
    public void setDataVencimento(LocalDate dataVencimento) { this.dataVencimento =  dataVencimento; }
    public FormaPagamento getFormaPagamento() { return formaPagamento; }
    public void setFormaPagamento(FormaPagamento formaPagamento) { this.formaPagamento =  formaPagamento; }
    public PlanoSaude getPlano() { return plano; }
    public Cnpj getCnpj() { return cnpj; }
    public void setCnpj(String cnpjEmissor){
        Cnpj c = new Cnpj();
        c.setCnpj(cnpjEmissor);
        this.cnpj = c;
    }
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Fatura ID: " + idFatura +
                "\nPaciente: " + (paciente != null ? paciente.getNome() : "N/A") +
                "\nValor: " + valor +
                "\nStatus: " + status +
                "\nForma de pagamento: " + formaPagamento +
                "\nData emissão: " + dataEmissao +
                "\nData vencimento: " + dataVencimento;
    }


}