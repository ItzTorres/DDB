package bd.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prueba {

    public static void main(String[] args) {
        Conexion con = null;
        con = new Conexion("10.100.73.88", "3306", "proyecto1");
        Connection conect = con.getConn();
        try {
            PreparedStatement ps = conect.prepareStatement("delete from usuario where idusuario = 666");
            ps.execute();
            /*
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("idUsuario = " + rs.getString("idUsuario") + "\tNombre = " + rs.getString("nombre") + "\n");
            }
            */
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta");
        }
    }
}