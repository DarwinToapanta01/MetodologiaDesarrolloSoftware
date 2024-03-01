package Interfaz;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;

public class Laboratorio01 extends javax.swing.JFrame implements Runnable {

    String hora, minuto, segundo;
    Thread hilo;

    Calendar fecha_actual = new GregorianCalendar();

    public Laboratorio01() {
        initComponents();
        Clases.Usuario objetoUsuario = new Clases.Usuario();
        objetoUsuario.MostrarSexoCombo(genero);
        diaIngreso.setText(fecha());
        dia.setCalendar(fecha_actual);
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void eliminarInformacion() {
        Clases.Usuario borrar = new Clases.Usuario();
        borrar.Eliminar(WIDTH);
    }

    /*public String hora() {
        Calendar calendario = new GregorianCalendar();
        Date horaActual = new Date();
        calendario.setTime(horaActual);
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minuto = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
        return hora + ":" + minuto + ":" + segundo;
    }*/
    public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        dia = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        regresarBt = new javax.swing.JButton();
        salirtBt = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        horaIngreso = new javax.swing.JLabel();
        diaIngreso = new javax.swing.JLabel();
        materia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        alumnos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        genero = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dia.setDateFormatString("yyyy/MM/dd");
        dia.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jPanel6.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 0, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AYUDA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESE SU NOMBRE:");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO AL LABORATORIO 01");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        regresarBt.setBackground(new java.awt.Color(0, 0, 51));
        regresarBt.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        regresarBt.setForeground(new java.awt.Color(255, 255, 255));
        regresarBt.setText("REGRESAR");
        jPanel6.add(regresarBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        salirtBt.setBackground(new java.awt.Color(0, 0, 51));
        salirtBt.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        salirtBt.setForeground(new java.awt.Color(255, 255, 255));
        salirtBt.setText("SALIR");
        salirtBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirtBtActionPerformed(evt);
            }
        });
        jPanel6.add(salirtBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, -1, -1));

        guardar.setBackground(new java.awt.Color(0, 0, 51));
        guardar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel6.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        mostrar.setBackground(new java.awt.Color(0, 0, 51));
        mostrar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        mostrar.setForeground(new java.awt.Color(255, 255, 255));
        mostrar.setText("MOSTRAR");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        jPanel6.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        horaIngreso.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        horaIngreso.setForeground(new java.awt.Color(255, 255, 255));
        horaIngreso.setText("00:00:00");
        jPanel6.add(horaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        diaIngreso.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        diaIngreso.setForeground(new java.awt.Color(255, 255, 255));
        diaIngreso.setText("DD/MM/YYYY");
        jPanel6.add(diaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));
        jPanel6.add(materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 137, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INGRESE LA MATERIA:");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CANTIDAD DE ALUMNOS:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        jPanel6.add(alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 138, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("OBSERVACIONES DENTRO DEL LABORATORIO:");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        observacion.setColumns(20);
        observacion.setRows(5);
        jScrollPane1.setViewportView(observacion);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 510, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELECCIONE GÉNERO");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        jPanel6.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 133, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("INGRESE SU ID;");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 133, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel6.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 133, -1));
        jPanel6.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 137, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Inicio2.png"))); // NOI18N
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
        Salida regresa = new Salida();
        regresa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mostrarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        Clases.Usuario objetoInformacion = new Clases.Usuario();
        objetoInformacion.agregarInfo(dia, nombre, genero, materia, alumnos, observacion);
        nombre.setText("");
        genero.setSelectedIndex(0);
        materia.setText("");
        alumnos.setText("");
        observacion.setText("");
        id.setText("");
    }//GEN-LAST:event_guardarActionPerformed

    private void salirtBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirtBtActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirtBtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        help1 helpPr = new help1();
        helpPr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Laboratorio01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laboratorio01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laboratorio01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laboratorio01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laboratorio01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alumnos;
    private com.toedter.calendar.JDateChooser dia;
    private javax.swing.JLabel diaIngreso;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel horaIngreso;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField materia;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextArea observacion;
    private javax.swing.JButton regresarBt;
    private javax.swing.JButton salirtBt;
    // End of variables declaration//GEN-END:variables
}