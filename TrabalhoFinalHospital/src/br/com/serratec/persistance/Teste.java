package br.com.serratec.persistance;
import java.util.Scanner;
import br.com.serratec.CSV.gerarCSV;
import br.com.serratec.Model.Fatura;
import br.com.serratec.Model.NotaFiscal;

public class Teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o id da fatura");
        Integer id = sc.nextInt();

        FaturaDaoImpl faturaDao = new FaturaDaoImpl();

        Fatura fatura = faturaDao.buscarPorId(id);

        System.out.println(fatura);

        if (fatura != null) {
            NotaFiscal nota = new NotaFiscal(fatura);

            NotaFiscalDao notaFiscalDao = new NotaFiscalDao();

            notaFiscalDao.salvar(nota);

            nota.setPaciente(fatura.getPaciente());

            System.out.println(nota.toString());

            gerarCSV.imprimirCSV(nota);

            System.out.println("Nota Fiscal Gerada com Sucesso!!! ");
            
        }
        else{
            System.out.println("Fatura inexistente!!");
        }
    }

    

}
