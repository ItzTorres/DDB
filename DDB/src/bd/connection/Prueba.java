package bd.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prueba {

    public static void main(String[] args) {
        Conexion con = null;
        con = new Conexion("localhost", "3306", "mydb");
        Connection conect = con.getConn();
        String consulta = "SELECT s.* from servicio s, catalogo_servicios c "
                        + "where s.Catalogo_Servicios_idCS = c.idCS and c.Nombre like \"P├║blico\"";
        System.out.println(consulta);
        try {
            String[] lista = new String[1];
            PreparedStatement ps = conect.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            //System.out.println(rs.getString(2));
            /*
            while (rs.next()) {
                lista[0] = rs.getString(2);
                modeloLista.addElement(lista[0]);
            }
            */
        } catch (SQLException ex) {
            System.out.println("Error en la consulta");
        }
    }
}