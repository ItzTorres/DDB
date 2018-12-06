package Forms;

/**
 *
 * @author itzel
 */
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.JDBCType.NULL;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class Conexion{

//Datos para la conexion con la base de datos
private String usuario = "root";
private String contraseña = "root";
private String host = "localhost";
private String BD = "mydb";
private Connection con = null;

public Connection getConexionMYSQL() {
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String servidor = "jdbc:mysql://" + host + "/" + BD;
        con = DriverManager.getConnection(servidor, usuario, contraseña);
        return con;
    } catch (Exception e) {
        e.printStackTrace();
        return con;
    }
}

    public static void main(String[] args) {
        //Inicio un objeto de la clase Pedido
        Conexion con = new Conexion();
        //Se llama al metodo
        Connection conexion = con.getConexionMYSQL();
        //comprobar que no sea nula la conexion
        if (conexion == null) {
            System.out.println("Error en la conexion");
        } else {
            System.out.println("Conexion Exitosa");
        }
        
        try {
            String selectQuery = "SELECT * FROM owner";
            PreparedStatement select = conexion.prepareStatement(selectQuery);
            java.sql.ResultSet rs = select.executeQuery();

            while (rs.next()) {
                String nick_o = rs.getString("Nick_O");
                String nick_p = rs.getString("Persona_Nick_U");

                
                System.out.println(nick_o + " corresponde " + nick_p);
            }

            conexion.close();
        } catch (SQLException e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
}

