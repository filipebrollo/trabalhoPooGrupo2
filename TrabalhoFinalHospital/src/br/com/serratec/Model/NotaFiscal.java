package br.com.serratec.Model;

import java.math.BigDecimal;

import java.math.RoundingMode;

public class NotaFiscal implements ImpostoCalculado {

    private Integer idNota;
    private static final String descricao = "Prestação de Serviços Médicos Hospitalares";
    private Fatura fatura;
    private Paciente paciente;
    private Cnpj cnpj;

    public NotaFiscal(Integer idNota, Fatura fatura) {
        this.idNota = idNota;
        this.fatura = fatura;
    }

    public NotaFiscal(Fatura fatura) {
        this.fatura = fatura;
        this.paciente = fatura.getPaciente();
        this.cnpj = fatura.getCnpj();
    };

    public Fatura getFatura() {
        return fatura;
    }

    public Integer getIdNota() {
        return idNota;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public BigDecimal getValor() {
        return fatura.getValor();
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Prestador de Serviço\n" +
                cnpj.getNomeFantasia() +
                "\nCNPJ: \n" + cnpj.getCnpj() +
                "\nTomador\nPaciente: " + (paciente != null ? paciente.getNome() : "N/A") +
                "Fatura ID: " + fatura.getIdFatura() +
                "\nDescrição de serviço \n" + descricao +
                "\nValores da Nota " +
                "\nValor Bruto do Serviço: " + fatura.getValor() +

                "\nISS\nAlíquota: 3%\nValor: R$" + valorISS().setScale(2, RoundingMode.HALF_UP) +
                "\nPIS\nAlíquota: 0,65%\nValor: R$" + valorPIS().setScale(2, RoundingMode.HALF_UP) +
                "\nCOFINS\nAlíquota: 3%\nValor: R$" + valorCOFINS().setScale(2, RoundingMode.HALF_UP) +
                "\nIRPJ\nPercentual Efetivo: 1,2%\nValor: R$" + valorIRPJ().setScale(2, RoundingMode.HALF_UP) +
                "\nCSLL\nPercentual Efetivo: 1,08%\nValor: R$" + valorCSLL().setScale(2, RoundingMode.HALF_UP) +

                "\nResumo dos Impostos\nimpostos                     Valor " +
                "\nISS            3,00%         R$" + valorISS().setScale(2, RoundingMode.HALF_UP) +
                "\nPIS            0,65%         R$" + valorPIS().setScale(2, RoundingMode.HALF_UP) +
                "\nCOFINS         3,00%         R$" + valorCOFINS().setScale(2, RoundingMode.HALF_UP) +
                "\nIRPJ           1,20%         R$" + valorIRPJ().setScale(2, RoundingMode.HALF_UP) +
                "\nCSLL           1,08%         R$" + valorCSLL().setScale(2, RoundingMode.HALF_UP);

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

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
