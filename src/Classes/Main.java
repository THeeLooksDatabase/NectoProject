package Classes;


import Classes.dao.BancoDao;
import Classes.model.Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args){

        Connection conn = AbrirConexao.getConnection();
        try {
            PreparedStatement stm = conn.prepareStatement("SELECT failed_count  FROM pg_stat_archiver ");
            ResultSet result = stm.executeQuery();
            while (result.next()){
                System.out.println(result.getString(1));
            }


        }catch (SQLException e){
            e.printStackTrace();

        } /* SELECT * FROM pg_stat_activity
            SELECT datid FROM pg_stat_activity

        */







    }
}
