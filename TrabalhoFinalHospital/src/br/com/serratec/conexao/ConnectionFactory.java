package br.com.serratec.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String url = "jdbc:postgresql://aws-1-sa-east-1.pooler.supabase.com:5432/postgres";
    private String usuario = "postgres.mpmshpcbkhsbvbkysyqi";
    private String senha = "wuLkMFsuaI92st0K";

    private  Connection connection;

    public Connection getConnection(){
        System.out.println("--- ~~ Conectando no Banco de Dados ... ");
        try {
            connection = DriverManager.getConnection(url, usuario, senha);
            if (connection != null) {
                System.out.println("Conetado com Sucesso!!!");
                return connection;   
            } else {
                System.out.println("Não foi Possível Conectar!!!");  
            }

        } catch (SQLException e) {
            System.err.println("Problemas no Driver ou Senha Incorreta do Banco!");
            e.printStackTrace();
        }
        return connection;
    }

}
