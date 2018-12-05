package bd.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author yeyof
 */
public class Conexion {
    public static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private String user = "rootremoto";
    private String password = "root";
    private String bd = "";
    private String direccion = "";
    private String puerto = "3306";
    //private static String url = "jdbc:mysql://localhost:3306/sams";

    public Conexion(){
        String url = "jdbc:mysql://" + direccion + ":" + puerto + "/" + bd;
        conn = null;
        try{
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Conexion establecida...");
            }
        } catch(Exception e){
            System.out.println("Error al conectar");
        }
    }
    
    public Conexion(String dir, String port, String base){
        conn = null;
        bd = base;
        puerto = port;
        direccion = dir;
        String url = "jdbc:mysql://" + direccion + ":" + puerto + "/" + bd;
        try{
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Conexion establecida...");
            }
        } catch(Exception e){
            System.out.println("Error al conectar");
        }
    }
    
    public Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        Conexion.conn = conn;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }
}