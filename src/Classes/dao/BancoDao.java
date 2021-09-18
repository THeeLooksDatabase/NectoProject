package Classes.dao;
import Classes.AbrirConexao;
import Classes.model.Banco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;

public class BancoDao {
    public  boolean inserir(Banco banco){
        String sql = "insert into metricas (tempo_de_resposta, tamanho_banco, espaco_indices, qtde_querys) values (?,?,?,?)";
        Connection conn = AbrirConexao.getConnection();

        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1,banco.getTempo());
            stm.setInt(2,banco.getTamanho());
            stm.setInt(3,banco.getEspaco());
            stm.setInt(4,banco.getQtde());

            stm.execute();
            stm.close();
            conn.close();
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }


    }

    public boolean alterar(Banco banco) {
        String sql = "update from metricas where tempo_de_resposta = ?, tamanho_banco = ?, espaco_indices = ?, qtde_querys = ?)";
        Connection conn = AbrirConexao.getConnection();
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, banco.getTempo());
            stm.setInt(2, banco.getTamanho());
            stm.setInt(3, banco.getEspaco());
            stm.setInt(4, banco.getQtde());
            stm.execute();
            stm.close();
            conn.close();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(Banco banco){
        String sql = "delete from metricas where tempo_de_resposta = ?, tamanho_banco = ?, espaco_indices = ?, qtde_querys = ?)";
        Connection conn = AbrirConexao.getConnection();
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, banco.getTempo());
            stm.setInt(2, banco.getTamanho());
            stm.setInt(3, banco.getEspaco());
            stm.setInt(4, banco.getQtde());
            stm.execute();
            stm.close();
            conn.close();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    /*
    public List<Banco> obtertodos(){
        String sql = "delete from metricas where tempo_de_resposta = ?, tamanho_banco = ?, espaco_indices = ?, qtde_querys = ?)";
        Connection conn = AbrirConexao.getConnection();
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet resultado = stm.executeQuery();
            List<Banco> bancos = new ArrayList<Banco>();
            while (resultado.next()){
                Banco banco = new Banco();
                banco.setTempo(resultado.getInt("tempo_de_resposta"));
                banco.setTamanho(resultado.getInt("tamanho_banco"));
                banco.setEspaco(resultado.getInt("espaco_indices"));
                banco.setTempo(resultado.getInt("qtde_querys"));
                bancos.add(banco);

            }
            stm.close();
            conn.close();
            return bancos;
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }*/
}
