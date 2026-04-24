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
<<<<<<< HEAD
                insert into nota_fiscal (id_fatura, nome_paciente, 
                valor , iss, pis, cofins, irpj, csll) 
                values(?, ?, ?, ?, ?, ?, ?, ?)
=======
                insert into nota_fiscal (id_fatura,nome_emissor,nome_paciente,descricao, 
                iss, pis, cofins, irpj, csll) 
                values(?, ?, ?, ?, ?, ?, ?, ?,?)
>>>>>>> 7108515f449ee332913be93487273ba5785812cd
                """;
                try {
                    PreparedStatement stmt = connection.prepareStatement(sql);

                    stmt.setInt(1, notaFiscal.getFatura().getIdFatura());
<<<<<<< HEAD
                    stmt.setString(2, notaFiscal.getPaciente().getNome());
                    stmt.setBigDecimal(3, notaFiscal.getValor());
                    stmt.setBigDecimal(4, notaFiscal.valorISS());
                    stmt.setBigDecimal(5, notaFiscal.valorPIS());
                    stmt.setBigDecimal(6, notaFiscal.valorCOFINS());
                    stmt.setBigDecimal(7, notaFiscal.valorIRPJ());
                    stmt.setBigDecimal(8, notaFiscal.valorCSLL());
=======
                    stmt.setString(2, notaFiscal.getFatura().getCnpj().getNomeFantasia());
                    stmt.setString(3, notaFiscal.getPaciente().getNome());
                    stmt.setString(4, notaFiscal.getDescricao());
                    stmt.setBigDecimal(5, notaFiscal.valorPIS());
                    stmt.setBigDecimal(6, notaFiscal.valorCOFINS());
                    stmt.setBigDecimal(7, notaFiscal.valorISS());
                    stmt.setBigDecimal(8, notaFiscal.valorIRPJ());
                    stmt.setBigDecimal(9, notaFiscal.valorCSLL());
>>>>>>> 7108515f449ee332913be93487273ba5785812cd
                    stmt.execute();
                    
                } catch (SQLException e) {
                    e.printStackTrace();
                }

    }


    





















}
