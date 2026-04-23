package br.com.serratec.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.serratec.Model.NotaFiscal;
import br.com.serratec.conexao.ConnectionFactory;

public class NotaFiscalDao implements NotaFiscalDaoImpl {

    private Connection connection;

    public NotaFiscalDao() {
        connection = new ConnectionFactory().getConnection();
    }
    @Override
    public void salvar(NotaFiscal notaFiscal){
        String sql = """
                insert into nota_fiscal (id_fatura, nome_paciente, 
                valor , iss, pis, cofins, irpj, csll) 
                values(?, ?, ?, ?, ?, ?, ?, ?)
                """;
                try {
                    PreparedStatement stmt = connection.prepareStatement(sql);

                    stmt.setInt(1, notaFiscal.getFatura().getIdFatura());
                    stmt.setString(2, notaFiscal.getPaciente().getNome());
                    stmt.setBigDecimal(3, notaFiscal.getValor());
                    stmt.setBigDecimal(4, notaFiscal.valorISS());
                    stmt.setBigDecimal(5, notaFiscal.valorPIS());
                    stmt.setBigDecimal(6, notaFiscal.valorCOFINS());
                    stmt.setBigDecimal(7, notaFiscal.valorIRPJ());
                    stmt.setBigDecimal(8, notaFiscal.valorCSLL());
                    stmt.execute();
                    
                } catch (SQLException e) {
                    e.printStackTrace();
                }

    }


    





















}
