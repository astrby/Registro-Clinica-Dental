package conexionBD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anthony
 */

public class Conexion {
    
    //Variables de conexion a BD.
    private static String usuario= "root";
    private static String contraseña = "administrador";
    private static String nombreBD = "clinica_dental_registro";
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/";
    public Connection cn = null;

    //Método para realizar la conexión a BD.
    public Connection conectar(){
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url+nombreBD, usuario, contraseña);
            System.out.println("Conexion realizada correctamente.");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error de conexión a base de datos.");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
    
    //Método para desconectar de la BD.
    public void desconectar(){
        try {
            cn.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo desconectar la base de datos.");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
