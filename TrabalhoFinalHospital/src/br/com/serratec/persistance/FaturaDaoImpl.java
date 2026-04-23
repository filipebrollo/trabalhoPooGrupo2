package br.com.serratec.persistance;

import java.sql.*;

import br.com.serratec.Model.Fatura;
import br.com.serratec.Model.Paciente;
import br.com.serratec.conexao.ConnectionFactory;

public class FaturaDaoImpl implements FaturaDao{
    private Connection connection ;

    public FaturaDaoImpl(){
        connection = new ConnectionFactory().getConnection();
    }
       public Fatura buscarPorId(Integer id){
        String sql = """
                select f.*,p.nome
                from fatura f
                join paciente p on f.id_paciente =p.id_paciente 
                where f.id_fatura = ?

                """;
                try{
                    PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, id);
                    ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        Fatura f = new Fatura();
                        f.setIdFatura(rs.getInt("id_fatura"));
                        f.setValor(rs.getBigDecimal("valor"));
                        f.setCnpj(rs.getString("Cnpj_emissor"));

                        Paciente p = new Paciente();
                        p.setNome(rs.getString ("nome"));
                        f.setPaciente (p);

                        return f;


                    }
                } catch(SQLException e){
                    e.printStackTrace();
                }
            return null;
    } 




}
