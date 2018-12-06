package Forms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;

/**
 *
 * @author arhel
 */
public class Contrato extends javax.swing.JFrame {
    bd.connection.Conexion conect = null;
    Connection con = null;
    DefaultListModel modeloLista = new DefaultListModel();
    bd.connection.Conexion conectServicio= null;
    bd.connection.Conexion conectVenta = null;
    String IDUsuario_Venta = null;
    
    
    public Contrato() {
        initComponents();
        this.setLocationRelativeTo(null);
        conectServicio = new bd.connection.Conexion("localhost", "3306", "mydb");
        conectVenta = new bd.connection.Conexion("ip", "dir", "venta");
        con = conect.getConn();
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOwner = new javax.swing.JLabel();
        lblAppOwner = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblfecha = new javax.swing.JLabel();
        lblTitleRenter = new javax.swing.JLabel();
        lblTitleOwner = new javax.swing.JLabel();
        lblApp = new javax.swing.JLabel();
        lblApm = new javax.swing.JLabel();
        txtRenterApp = new javax.swing.JTextField();
        txtApm = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtRenter1 = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        lblRenter1 = new javax.swing.JLabel();
        lblApmOwner = new javax.swing.JLabel();
        txtApm1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtAppOwner = new javax.swing.JTextField();
        RbtnMas = new javax.swing.JRadioButton();
        Rbtnfem = new javax.swing.JRadioButton();
        lblEdad = new javax.swing.JLabel();
        txtApm2 = new javax.swing.JTextField();
        lblCel = new javax.swing.JLabel();
        txtApm3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblOwner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOwner.setText("Nombre ");

        lblAppOwner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAppOwner.setText("Apellido Paterno");

        lblfecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblfecha.setText("Fecha de Nacimiento");

        lblTitleRenter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitleRenter.setText("Proporcioné los siguientes datos para registrarlo al Sistema de Servicios");

        lblTitleOwner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitleOwner.setText("Datos de la persona a ofrecer el Servicio");

        lblApp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApp.setText("Apellido Paterno");

        lblApm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApm.setText("Apellido Materno");

        jComboBox1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Servicio que presta");

        btnNext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNext.setText("Siguiente");

        lblRenter1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRenter1.setText("Nombre");

        lblApmOwner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApmOwner.setText("Apellido Materno");

        RbtnMas.setText("Masculino");
        RbtnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnMasActionPerformed(evt);
            }
        });

        Rbtnfem.setText("Femenino");
        Rbtnfem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnfemActionPerformed(evt);
            }
        });

        lblEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEdad.setText("Edad");

        lblCel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCel.setText("Cel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleOwner)
                    .addComponent(lblTitleRenter)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApm)
                                    .addComponent(lblOwner))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtApm, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RbtnMas)
                                            .addComponent(lblApp)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtRenter1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblfecha)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRenterApp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rbtnfem))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApmOwner)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApm1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAppOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAppOwner, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEdad)
                                .addGap(78, 78, 78)
                                .addComponent(txtApm2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(lblCel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApm3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRenter1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleRenter)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwner)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRenterApp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApp)
                    .addComponent(txtApm, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApm))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfecha)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RbtnMas)
                        .addComponent(Rbtnfem)))
                .addGap(31, 31, 31)
                .addComponent(lblTitleOwner)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRenter1)
                    .addComponent(txtRenter1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApmOwner)
                    .addComponent(txtApm1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAppOwner)
                    .addComponent(txtAppOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtApm2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCel)
                    .addComponent(txtApm3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RbtnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnMasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtnMasActionPerformed

    private void RbtnfemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnfemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtnfemActionPerformed

    public void obtenerDatos_Renter(){
     String  nombre = "SELECT nombre FROM usuario where ";
     String  app = "SELECT apPaterno FROM catalogo_servicios";
     String  apm = "SELECT apMaterno FROM catalogo_servicios";
     String  tel = "SELECT Telefono  FROM catalogo_servicios";

     
     
     
        /*try {
            PreparedStatement ps = con.prepareStatement(consulta_catalogo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CmbCatalogo.addItem(rs.getString(1));
            }

        } catch (SQLException ex) {
            System.out.println("Error en la consulta");
        }*/
    
    
    
    
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RbtnMas;
    private javax.swing.JRadioButton Rbtnfem;
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApm;
    private javax.swing.JLabel lblApmOwner;
    private javax.swing.JLabel lblApp;
    private javax.swing.JLabel lblAppOwner;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblOwner;
    private javax.swing.JLabel lblRenter1;
    private javax.swing.JLabel lblTitleOwner;
    private javax.swing.JLabel lblTitleRenter;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JTextField txtApm;
    private javax.swing.JTextField txtApm1;
    private javax.swing.JTextField txtApm2;
    private javax.swing.JTextField txtApm3;
    private javax.swing.JTextField txtAppOwner;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRenter1;
    private javax.swing.JTextField txtRenterApp;
    // End of variables declaration//GEN-END:variables
}
