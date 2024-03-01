package Clases;

import com.toedter.calendar.JDateChooser;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Usuario {

    int idSexo;

    public void establecerIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    public void MostrarSexoCombo(JComboBox genero) {

        Clases.Conexion objetoConexion = new Clases.Conexion();

        String sql = "select * from sexo";
        Statement st;

        try {
            st = objetoConexion.estableceConexion().createStatement();

            ResultSet rs = st.executeQuery(sql);
            genero.removeAllItems();

            while (rs.next()) {
                String nombreSexo = rs.getString("sexo");
                this.establecerIdSexo(rs.getInt("id"));

                genero.addItem(nombreSexo);
                genero.putClientProperty(nombreSexo, idSexo);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar sexo" + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public void agregarInfo(JDateChooser dia, JTextField nombre, JComboBox genero, JTextField materia, JTextField alumnos, JTextArea observacion) {
        Conexion obConexion = new Conexion();
        String consulta = "insert into usuarios(dia, nombre, fksexo, materia, alumnos, observacion) values (?,?,?,?,?,?)";
        try {
            CallableStatement cs = obConexion.estableceConexion().prepareCall(consulta);
            Date fechaDia = dia.getDate();
            java.sql.Date fechaDiaSQL = new java.sql.Date(fechaDia.getTime());

            cs.setDate(1, fechaDiaSQL);
            cs.setString(2, nombre.getText());
            int idSexo = (int) genero.getClientProperty(genero.getSelectedItem());
            cs.setInt(3, idSexo);
            cs.setString(4, materia.getText());
            cs.setString(5, alumnos.getText());
            cs.setString(6, observacion.getText());

            cs.executeUpdate();
            // JOptionPane.showMessageDialog(null, "Se agregó correcatmente la información");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar: " + e.toString());
        } finally {
            obConexion.cerrarConexion();
        }
    }

    public void mostrarUsuarios(JTable mostrarInfo) {
        Clases.Conexion objetoConexion = new Clases.Conexion();
        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";
        modelo.addColumn("ID");
        modelo.addColumn("FECHA");
        modelo.addColumn("ASIGNATURA");
        modelo.addColumn("DOCENTE");
        modelo.addColumn("GENERO");
        modelo.addColumn("CANTIDAD ALUMNOS");
        modelo.addColumn("OBSERVACIONES");

        mostrarInfo.setModel(modelo);

        sql = "select usuarios.id,usuarios.dia,usuarios.nombre,sexo.sexo, usuarios.materia,usuarios.alumnos,usuarios.observacion from usuarios INNER JOIN sexo ON usuarios.fksexo = sexo.id;";

        try {
            Statement st = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString("id");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                java.sql.Date fechaSQL = rs.getDate("dia");
                String nuevaFecha = sdf.format(fechaSQL);
                String nombre = rs.getString("nombre");
                String genero = rs.getString("sexo");
                String materia = rs.getString("materia");
                int cantidadAlumnos = rs.getInt("alumnos"); // Obtener la cantidad de alumnos como entero
                String observaciones = rs.getString("observacion");

                modelo.addRow(new Object[]{id, nuevaFecha, materia, nombre, genero, cantidadAlumnos, observaciones}); // Añadir  dentro del bucle while
            }
            mostrarInfo.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar usuarios: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public void Eliminar(int id) {
        Conexion objetoConexion = new Conexion();

        try {
            String consulta = "DELETE FROM usuarios WHERE usuarios.id = ?";

            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setInt(1, id);
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
        } catch (Exception e) {
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public void buscarUsuarioPorId(int id, JTable mostrarInfo) {
        Conexion objetoConexion = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";
        modelo.addColumn("ID");
        modelo.addColumn("FECHA");
        modelo.addColumn("ASIGNATURA");
        modelo.addColumn("DOCENTE");
        modelo.addColumn("GENERO");
        modelo.addColumn("CANTIDAD ALUMNOS");
        modelo.addColumn("OBSERVACIONES");

        mostrarInfo.setModel(modelo);

        sql = "SELECT usuarios.id, usuarios.dia, usuarios.nombre, sexo.sexo, usuarios.materia, usuarios.alumnos, usuarios.observacion FROM usuarios INNER JOIN sexo ON usuarios.fksexo = sexo.id WHERE usuarios.id = " + id;

        try {
            Statement st = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String idUsuario = rs.getString("id");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                java.sql.Date fechaSQL = rs.getDate("dia");
                String nuevaFecha = sdf.format(fechaSQL);
                String nombre = rs.getString("nombre");
                String genero = rs.getString("sexo");
                String materia = rs.getString("materia");
                int cantidadAlumnos = rs.getInt("alumnos"); // Obtener la cantidad de alumnos como entero
                String observaciones = rs.getString("observacion");

                modelo.addRow(new Object[]{idUsuario, nuevaFecha, materia, nombre, genero, cantidadAlumnos, observaciones}); // Añadir dentro del bucle while
            }
            mostrarInfo.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar usuario por ID: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

}
