package br.com.serratec.Model;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.serratec.Enumerate.FormaPagamento;
import br.com.serratec.Enumerate.StatusFatura;

public class NotaFiscal extends Fatura {

    private Integer idNota;
    private String descricao;

    public NotaFiscal(Integer idFatura, BigDecimal valor, StatusFatura status, Paciente paciente, LocalDate dataEmissao,
            LocalDate dataVencimento, FormaPagamento formaPagamento, PlanoSaude plano, Cnpj cnpj, Integer idNota,
            String descricao) {
        super(idFatura, valor, status, paciente, dataEmissao, dataVencimento, formaPagamento, plano, cnpj);
        this.idNota = idNota;
        this.descricao = descricao;
    }

    public Integer getIdNota() {
        return idNota;
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "NotaFiscal [idNota=" + idNota + ", descricao=" + descricao + ", getId()=" + getId() + ", getValor()="
                + getValor() + ", getStatus()=" + getStatus() + ", getPaciente()=" + getPaciente()
                + ", getDataEmissao()=" + getDataEmissao() + ", getDataVencimento()=" + getDataVencimento()
                + ", getFormaPagamento()=" + getFormaPagamento() + ", getPlano()=" + getPlano() + ", getCnpj()="
                + getCnpj() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + "]";
    }

    @Override
    public BigDecimal valorISS() {
        return getValor().multiply(new BigDecimal(0.03)); 
    }

    @Override
    public BigDecimal valorPIS() {
        return getValor().multiply(new BigDecimal(0.65)); 
    }
    
    @Override
    public BigDecimal valorCOFINS() {
        return getValor().multiply(new BigDecimal(3)); 
    }

    @Override
    public BigDecimal valorIRPJ() {
        return getValor().multiply(new BigDecimal(1.2)); 
    }

    @Override
    public BigDecimal valorCSLL() {
        return getValor().multiply(new BigDecimal(1.08)); 
    }

    
}
