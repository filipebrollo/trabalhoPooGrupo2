package br.com.serratec.Model;

import java.math.BigDecimal;

public class NotaFiscal implements ImpostoCalculado{

    private Integer idNota;
    private static final String descricao = "Prestação de Serviços Médicos Hospitalares";
    private Fatura fatura;
    private Paciente paciente;
    private Cnpj cnpj;

    public NotaFiscal(Integer idNota,Fatura fatura) {
        this.idNota = idNota;
        this.fatura = fatura;
    }

    public NotaFiscal(Fatura fatura){};

    public Fatura getFatura(){return fatura;}

    public Integer getIdNota() {
        return idNota;
    }

    public Paciente  getPaciente(){return paciente;}

    public BigDecimal getValor(){return fatura.getValor();}

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }

    public String getDescricao() {
        return descricao;
    }

 @Override
    public String toString() {
        return 
                "Prestador de Serviço\n" +
                cnpj.getNomeFantasia() +
                "\nCNPJ: " + cnpj.getCnpj() +
                "Tomador\nPaciente: " + (paciente != null ? paciente.getNome() : "N/A") + 
                "Fatura ID: " + fatura.getIdFatura() +
                "\nDescrição de serviço \n" +  descricao +
                "\nValores da Nota " +
                "\nValor Bruto do Serviço: " + fatura.getValor() +
                "\nISS\nAlíquota: 3%\nValor: R$" + valorISS() +
                "\nPIS\nAlíquota: 0,65%\nValor: R$" + valorPIS() +
                "\nCOFINS\nAlíquota: 3%\nValor: R$" + valorCOFINS() +
                "\nIRPJ\nPercentual Efetivo: 1,2%\nValor: R$" + valorIRPJ() +
                "\nCSLL\nPercentual Efetivo: 1,08%\nValor: R$" + valorCSLL() +

                "\nResumo dos Impostos\nimpostos                     Valor " +
                "\nISS            3,00%         R$" + valorISS() + 
                "\nPIS            0,65%         R$" + valorPIS() + 
                "\nCOFINS         3,00%         R$" + valorCOFINS() + 
                "\nIRPJ           1,20%         R$" + valorIRPJ() + 
                "\nCSLL           1,08%         R$" + valorCSLL();
                
                
    }

    public BigDecimal valorISS() {
        return fatura.getValor().multiply(new BigDecimal(0.03)); 
    }
    
    public BigDecimal valorPIS() {
        return fatura.getValor().multiply(new BigDecimal(0.065)); 
    }
    
    public BigDecimal valorCOFINS() {
        return fatura.getValor().multiply(new BigDecimal(0.03)); 
    }

    public BigDecimal valorIRPJ() {
        return fatura.getValor().multiply(new BigDecimal(0.12)); 
    }

    public BigDecimal valorCSLL() {
        return fatura.getValor().multiply(new BigDecimal(0.08)); 
    }

    
}
