package bd.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prueba {

    public static void main(String[] args) {
        Conexion con = null;
        con = new Conexion("192.168.0.6", "3306", "renter");
        Connection conect = con.getConn();
        try {
            PreparedStatement ps = conect.prepareStatement("select * from servicio where idServicio = 1");
            ps.execute();
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("idServicio = " + rs.getString("idServicio") + "\tNombre = " + rs.getString("Nombre") + "\n");
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta");
        }
    }
}