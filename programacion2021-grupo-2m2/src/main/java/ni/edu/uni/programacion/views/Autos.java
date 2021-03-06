/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.views;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import ni.edu.uni.programacion.backend.pojo.Vehicle;
import ni.edu.uni.programacion.controllers.PnlViewVehicleController;
import ni.edu.uni.programacion.data.models.ListTableModel;
import ni.edu.uni.programacion.views.panels.PnlViewVehicle;

/**
 *
 * @author at289
 */
public class Autos extends javax.swing.JInternalFrame {
 private List<Vehicle>cuentas;
    private PnlViewVehicle pnlViewVehicles;    
    private PnlViewVehicleController pnlViewVehicleController;
  
    /**
     * Creates new form Autos
     */
    public Autos() {
        initComponents();
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
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        pnlContent = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 204, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("NewAuto");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlContent.setLayout(new java.awt.BorderLayout());
        pnlViewVehicles = new PnlViewVehicle();
        pnlViewVehicleController = new PnlViewVehicleController(pnlViewVehicles);

        pnlContent.add(pnlViewVehicles, BorderLayout.CENTER);
        getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        DialogVehicle dlgVehicle = new DialogVehicle(null, true);
        dlgVehicle.addPropertySupport(pnlViewVehicleController.getTblViewModel());
        dlgVehicle.setVisible(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{  
        int row = pnlViewVehicles.tblViewVehicle.getSelectedRowCount();
int modelRow = pnlViewVehicles.tblViewVehicle.convertRowIndexToModel( row );
ListTableModel list  = (ListTableModel)pnlViewVehicles.tblViewVehicle.getModel();
list.removeRow(modelRow);
        }catch(Exception ex){ 
            JOptionPane.showMessageDialog(null, ex);
        }
  
//        int row =  pnlViewVehicles.tblViewVehicle.getSelectedRow();
//        int column = pnlViewVehicles.tblViewVehicle.getSelectedColumn();
//        if(column % 2!=0){
//            column--;
//        }
//        String selected = pnlViewVehicles.tblViewVehicle.getModel().getValueAt(row, column).toString();
//        if(selected == null){
//          selected = " ";  
//        }
//        
//        Vehicle v = getCuentaByName(selected);
//        
//        if(v == null){
//            JOptionPane.showMessageDialog(this, "NO se puede eliminar esta celda", "Ventana de confirmacion", JOptionPane.INFORMATION_MESSAGE);
//        }else{
//            int repose = JOptionPane.showConfirmDialog(this, "Esta seguro que desea elimnar este auto"+v.getModel()+v.getStyle()+"?"
//                    ,"Ventana de confirmacion",JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
//            if(repose == JOptionPane.OK_OPTION){
//                cuentas.remove(v);
//                pnlViewVehicles.tblViewVehicle.setModel(pnlViewVehicleController.getTblViewModel()); 
//            }
//        
//        }
    }//GEN-LAST:event_btnDeleteActionPerformed

//     private Vehicle getCuentaByName(String name){
//        Vehicle CBG = null;
//        for (Vehicle cuenta : cuentas) {//Hacer con expresiones lambda
//            if (cuenta.getModel().equals(name)) {
//                CBG = cuenta;
//                break;
//            }
//        }
//        return CBG;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}
