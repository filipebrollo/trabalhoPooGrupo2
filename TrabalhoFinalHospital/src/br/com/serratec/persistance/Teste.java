package br.com.serratec.persistance;
import java.util.Scanner;

<<<<<<< HEAD
import br.com.serratec.Model.Fatura;
import br.com.serratec.Model.NotaFiscal;

public class Teste {
    public static void main(String[] args) {
=======
import br.com.serratec.CSV.gerarCSV;

import br.com.serratec.Model.Fatura;
import br.com.serratec.Model.NotaFiscal;


public class Teste {
    public static void main(String[] args) {

>>>>>>> 7108515f449ee332913be93487273ba5785812cd
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o id da fatura");
        Integer id = sc.nextInt();

        FaturaDaoImpl faturaDao = new FaturaDaoImpl();

        Fatura fatura = faturaDao.buscarPorId(id);

        System.out.println(fatura);

        if (fatura != null) {
            NotaFiscal nota = new NotaFiscal(fatura);
<<<<<<< HEAD

            NotaFiscalDao notaFiscalDao = new NotaFiscalDao();

            notaFiscalDao.salvar(nota);
=======
            nota.setPaciente(fatura.getPaciente());

            System.out.println(nota.toString());

            NotaFiscalDao notaFiscalDao = new NotaFiscalDao();

            gerarCSV.imprimirCSV(nota);

>>>>>>> 7108515f449ee332913be93487273ba5785812cd

            System.out.println("Nota Fiscal Gerada com Sucesso!!! ");
            
        }
        else{
            System.out.println("Fatura inexistente!!");
        }
    }

    

}
