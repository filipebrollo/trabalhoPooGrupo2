package br.com.serratec.Model;

public class Cnpj {
    private final String cnpj = "12345678000199";
    private final String nomeFantasia = "Clínica Saúde XPTO Ltda.";

    public String getCnpj() {
        return cnpj;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    @Override
    public String toString() {
        return nomeFantasia + "\n" + cnpj + "\n";
    }
<<<<<<< HEAD
=======

    public String setCnpj(String cnpjEmissor) {
        return cnpj;
    }
>>>>>>> 7108515f449ee332913be93487273ba5785812cd
}
