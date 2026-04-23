package br.com.serratec.persistance;
import java.util.Scanner;

import br.com.serratec.Model.Fatura;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o id da fatura");
        Integer id = sc.nextInt();

        FaturaDaoImpl faturaDao = new FaturaDaoImpl();

        Fatura fatura = faturaDao.buscarPorId(id);

        System.out.println(fatura);
        
    }

}
