/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.DocenteController;
import controller.ModuloController;
import controller.SemestreController;
import java.util.List;
import java.util.Map;
import org.jdesktop.swingx.autocomplete.*;

public class FrmDocenteModulo extends javax.swing.JFrame {

    private DocenteController docenteController;
    private ModuloController moduloController;
    private SemestreController semestreController;

    /**
     * Creates new form FrmDocenteModulo
     */
    public FrmDocenteModulo() {
        initComponents();
        docenteController = new DocenteController();
        moduloController = new ModuloController();
        semestreController = new SemestreController();
        configurarAutoCompletar();
    }

    private void configurarAutoCompletar() {
        // configurando el autocompletado del textFile Docente.
        List<String> nombresCompletos = docenteController.listarNombresYApellidosDocentes();
        AutoCompleteDecorator.decorate(txt_docente, nombresCompletos, false);
        
        // configurando el autocompletado del textFile Modulo.
        List<String> nombres = moduloController.listarNombres();
        AutoCompleteDecorator.decorate(txt_modulo, nombres, false);
        
        // configurando el autocompletado del textFile Semestre.
        List<String> detallesSemestre = semestreController.listarDetalle();
        AutoCompleteDecorator.decorate(txt_semestre, detallesSemestre, false);
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txt_docente = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txt_modulo = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txt_semestre = new javax.swing.JTextField();
    txt_dni = new javax.swing.JTextField();
    txt_idModulo = new javax.swing.JTextField();
    txt_idSemestre = new javax.swing.JTextField();
    cmd_guardar = new javax.swing.JButton();
    cmd_guardar1 = new javax.swing.JButton();
    cmd_guardar2 = new javax.swing.JButton();
    cmd_guardar3 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jScrollPane1.setViewportView(jTable1);

    jPanel1.setForeground(new java.awt.Color(204, 204, 204));

    jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 51, 51));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("ASIGNAR MÓDULO A DOCENTE");

    jLabel2.setText("Docente");

    txt_docente.addComponentListener(new java.awt.event.ComponentAdapter() {
      public void componentShown(java.awt.event.ComponentEvent evt) {
        txt_docenteComponentShown(evt);
      }
    });
    txt_docente.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_docenteActionPerformed(evt);
      }
    });

    jLabel3.setText("Modulo");

    txt_modulo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_moduloActionPerformed(evt);
      }
    });

    jLabel4.setText("Semestre");

    txt_semestre.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_semestreActionPerformed(evt);
      }
    });

    txt_dni.setEditable(false);

    txt_idModulo.setEditable(false);

    txt_idSemestre.setEditable(false);

    cmd_guardar.setText("GRABAR");
    cmd_guardar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmd_guardarActionPerformed(evt);
      }
    });

    cmd_guardar1.setText("MODIFICAR");
    cmd_guardar1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmd_guardar1ActionPerformed(evt);
      }
    });

    cmd_guardar2.setText("ELIMINAR");
    cmd_guardar2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmd_guardar2ActionPerformed(evt);
      }
    });

    cmd_guardar3.setText("LISTAR");
    cmd_guardar3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmd_guardar3ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txt_modulo)
                  .addComponent(txt_semestre)
                  .addComponent(txt_docente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txt_idModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txt_idSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(cmd_guardar)
                .addGap(18, 18, 18)
                .addComponent(cmd_guardar1)
                .addGap(27, 27, 27)
                .addComponent(cmd_guardar2)
                .addGap(27, 27, 27)
                .addComponent(cmd_guardar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txt_docente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txt_modulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txt_idModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txt_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txt_idSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cmd_guardar)
          .addComponent(cmd_guardar1)
          .addComponent(cmd_guardar2)
          .addComponent(cmd_guardar3))
        .addGap(0, 6, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(433, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(95, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void cmd_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd_guardarActionPerformed

    private void txt_docenteComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txt_docenteComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_docenteComponentShown

  private void txt_docenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_docenteActionPerformed
    // evento después de pulsar enter
    Map<String, String> mapaNombresDni = docenteController.obtenerMapaNombresDni();
    String nombreSeleccionado = txt_docente.getText();
    String dni = mapaNombresDni.get(nombreSeleccionado);
    txt_dni.setText(dni != null ? dni : "");
  }//GEN-LAST:event_txt_docenteActionPerformed

  private void txt_moduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_moduloActionPerformed
    // evento después de pulsar enter
    Map<String, Integer> mapaNombresId = moduloController.obtenerMapaNombresId();
    String nombre = txt_modulo.getText();
    Integer id = mapaNombresId.get(nombre);
    txt_idModulo.setText(id != null ? String.valueOf(id) : "");
  }//GEN-LAST:event_txt_moduloActionPerformed

  private void txt_semestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_semestreActionPerformed
    // TODO add your handling code here:
    Map<String, String> mapaDetalleId = semestreController.obtenerMapaDetalleId();
    String detalleSeleccionado = txt_semestre.getText();
    String idSemestre = mapaDetalleId.get(detalleSeleccionado);
    txt_idSemestre.setText(idSemestre != null ? idSemestre : "");
  }//GEN-LAST:event_txt_semestreActionPerformed

  private void cmd_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_guardar1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cmd_guardar1ActionPerformed

  private void cmd_guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_guardar2ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cmd_guardar2ActionPerformed

  private void cmd_guardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_guardar3ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cmd_guardar3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmDocenteModulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDocenteModulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDocenteModulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDocenteModulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDocenteModulo().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton cmd_guardar;
  private javax.swing.JButton cmd_guardar1;
  private javax.swing.JButton cmd_guardar2;
  private javax.swing.JButton cmd_guardar3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JTextField txt_dni;
  private javax.swing.JTextField txt_docente;
  private javax.swing.JTextField txt_idModulo;
  private javax.swing.JTextField txt_idSemestre;
  private javax.swing.JTextField txt_modulo;
  private javax.swing.JTextField txt_semestre;
  // End of variables declaration//GEN-END:variables
}
