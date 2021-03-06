/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contPlanilla;

import contGeneral.CostosPlanilla;
import contGeneral.PlanillaOrden;
import contGeneral.listaPlanOrden;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import otros.TModeloPlanOrden;
import otros.allFrames;
import otros.conexionBD;
import sic115.catalogoVista;

/**
 *
 * @author Alejandor
 */
public class Planilla_Orden extends javax.swing.JFrame {

    conexionBD conexionCuentas = new conexionBD();
    TModeloPlanOrden modeloPlanOrden = new TModeloPlanOrden();
    public listaPlanOrden listaC = new listaPlanOrden();
    ArrayList<PlanillaOrden> list = listaC.getListaOrdenes();
    Double p = 0.0;
    DecimalFormat formateador = new DecimalFormat("#.##");

    /**
     *
     */
    public Planilla_Orden() {
        initComponents();
        allFrames.aplicarTema(this);
        new allFrames().CargarIcono(this);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu Principal para Asignacion de Planilla por Orden");
        this.setResizable(false);
        inicializarColumnas();
        FillcomboEmpleado();
        tnombre.setEditable(false);
        tdui.setEditable(false);
        tsalario.setEditable(false);
        tapellido.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        comboOrden = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlanOrden = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tapellido = new javax.swing.JTextField();
        tnombre = new javax.swing.JTextField();
        tdui = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tsalario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Codigo:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        comboOrden.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(comboOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(comboOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        tablaPlanOrden.setModel(modeloPlanOrden);
        tablaPlanOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPlanOrdenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPlanOrden);

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Nombres: ");

        jLabel5.setText("DUI:");

        tapellido.setEditable(false);

        tnombre.setEditable(false);

        tdui.setEditable(false);

        jLabel6.setText("Salario Nominal:");

        tsalario.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tdui, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(tapellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(tsalario))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(tapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tdui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jButton2.setText("Guardar Planilla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Planilla por Orden");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jButton2)
                .addGap(29, 29, 29)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String idorden = (String) comboOrden.getSelectedItem();
        this.tablaPlanOrden.repaint();
        refrescarTabla2();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboOrdenActionPerformed

    private void tablaPlanOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPlanOrdenMouseClicked
        int i = tablaPlanOrden.getSelectedRow();
        tdui.setText(tablaPlanOrden.getValueAt(i, 0).toString());
        tnombre.setText(tablaPlanOrden.getValueAt(i, 1).toString());
        tapellido.setText(tablaPlanOrden.getValueAt(i, 2).toString());

        String salarioxhoras = tablaPlanOrden.getValueAt(i, 4).toString();
        String horas = tablaPlanOrden.getValueAt(i, 5).toString();
        Double sh = Double.parseDouble(salarioxhoras);
        int h = Integer.parseInt(horas);
        p = sh * h;
        
        tsalario.setText(String.valueOf(formateador.format(p)));

    }//GEN-LAST:event_tablaPlanOrdenMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        CostosPlanilla costos = new CostosPlanilla();
        String dui = tdui.getText();
        String salario = tsalario.getText();
        if (dui.isEmpty() && salario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay parametros para ingresar a Planilla");
        } else {
            int i = tablaPlanOrden.getSelectedRow();
            listaPlanOrden planOrden = new listaPlanOrden();
            planOrden.guardarPlanOrden(tdui.getText(), p, tablaPlanOrden.getValueAt(i, 3).toString());
            String idorden = (String) comboOrden.getSelectedItem();
            costos.CambiarEstadoMPEnTablaTiene(Integer.parseInt(idorden));
            JOptionPane.showMessageDialog(this, "Planilla Guardada");
            refrescarTabla2();
            tdui.setText(null);
            tnombre.setText(null);
            tapellido.setText(null);
            tsalario.setText(null);
            tablaPlanOrden.repaint();

        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Planilla_Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planilla_Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planilla_Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planilla_Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planilla_Orden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboOrden;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPlanOrden;
    private javax.swing.JTextField tapellido;
    private javax.swing.JTextField tdui;
    private javax.swing.JTextField tnombre;
    private javax.swing.JTextField tsalario;
    // End of variables declaration//GEN-END:variables
private void FillcomboEmpleado() {
        try {
            comboOrden.removeAllItems();
            String sqlGeneral = "select * from orden";
            PreparedStatement declaracion1;
            declaracion1 = null;
            declaracion1 = this.conexionCuentas.getConexion().prepareCall(sqlGeneral);
            ResultSet resultado1 = declaracion1.executeQuery();
            while (resultado1.next()) {
                String name = resultado1.getString("id_orden");
                comboOrden.addItem(name);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void inicializarColumnas() {
        TableColumnModel tColumnModel = new DefaultTableColumnModel();
        for (int i = 0; i < 6; i++) {
            TableColumn col = new TableColumn(i);
            switch (i) {
                case 0:
                    col.setHeaderValue("DUI");
                    break;
                case 1:
                    col.setHeaderValue("Nombre");
                    break;
                case 2:
                    col.setHeaderValue("Apellido");
                    break;
                case 3:
                    col.setHeaderValue("id Orden");
                    break;
                case 4:
                    col.setHeaderValue("Salario Por Hora");
                    break;
                case 5:
                    col.setHeaderValue("Numero de Horas");

            }
            tColumnModel.addColumn(col);
        }
        this.tablaPlanOrden.setColumnModel(tColumnModel);

    }

    public void refrescarTabla2() {
        String idorden = (String) comboOrden.getSelectedItem();
        this.list.clear();
        modeloPlanOrden.ordenes.clear();
        this.listaC.BuscarOrden(Integer.parseInt(idorden));
        list = listaC.getListaOrdenes();
        modeloPlanOrden.ordenes.clear();
        for (PlanillaOrden c : this.list) {
            this.modeloPlanOrden.ordenes.add(c);

        }
        modeloPlanOrden.fireTableDataChanged();
    }
}
