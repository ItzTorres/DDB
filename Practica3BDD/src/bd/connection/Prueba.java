package bd.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prueba {

    public static void main(String[] args) {
        Conexion con = null;
        con = new Conexion("192.168.100.151", "3306", "sams");
        Connection conect = con.getConn();
        try {
            PreparedStatement ps = conect.prepareStatement("SELECT idSocio, nombre from socio");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("idSocio = " + rs.getString("idSocio") + "\tNombre = " + rs.getString("nombre") + "\n");
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta");
        }
    }
}
