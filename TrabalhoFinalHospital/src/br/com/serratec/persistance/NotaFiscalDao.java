package br.com.serratec.persistance;

import java.sql.Connection;

import br.com.serratec.conexao.ConnectionFactory;

public class NotaFiscalDao {

    private Connection connection;

    public NotaFiscalDao(Connection connection) {
        connection = new ConnectionFactory().getConnection();
    }

    





















}
