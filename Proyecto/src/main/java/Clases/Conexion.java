package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Conexion {

    Connection conectar = null;
    String usuario = "root";
    String password = "080210";
    String bd = "bdDatos";
    String ip = "localhost";
    String puerto = "3306";

    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection estableceConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, password);
            JOptionPane.showMessageDialog(null, "Se conecto correctamentea la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conecto a la base de datos");
        }
        return conectar;
    }
    
    public void cerrarConexion(){
        try {
            if(conectar!=null && !conectar.isClosed()){
                conectar.close();
                JOptionPane.showMessageDialog(null, "Conexion cerrada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexion");
        }
    }
    
    
}
/*public MongoClient crearConexion() {
        MongoClient mongo = null;
        String servidor = "localhost";
        Integer puerto = 27017;
        try {
            mongo = new MongoClient(servidor, puerto);
            
            List<String> databaseNames = mongo.getDatabaseNames();
            JOptionPane.showMessageDialog(null, "Se conecto correctamente, las cuales son: "+databaseNames);
            
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion, error: " + e.toString());
        }
        return mongo;
    }*/
