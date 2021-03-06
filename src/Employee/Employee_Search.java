/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import DAL.EmployeeDal;
import DatabaseConnectivity.DatabaseConnectivity;
import classes.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author MUHAMMED BILAL
 */
public class Employee_Search extends javax.swing.JFrame {

    /**
     * Creates new form Team_Add
     */
    DatabaseConnectivity objConnectivity;
    private Connection Connection;
    public Employee_Search() {
        initComponents();
        objConnectivity=new DatabaseConnectivity();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jlabel1 = new javax.swing.JLabel();
        EmployeeSearch = new javax.swing.JButton();
        back = new javax.swing.JButton();
        option = new javax.swing.JComboBox<>();
        employee = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jlabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlabel1.setForeground(new java.awt.Color(255, 255, 255));
        jlabel1.setText("Search Employee");
        jPanel2.add(jlabel1);
        jlabel1.setBounds(390, 130, 310, 40);

        EmployeeSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmployeeSearch.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/google search.png"))); // NOI18N
        EmployeeSearch.setText("Search");
        EmployeeSearch.setContentAreaFilled(false);
        EmployeeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeSearchActionPerformed(evt);
            }
        });
        jPanel2.add(EmployeeSearch);
        EmployeeSearch.setBounds(440, 390, 150, 50);

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/icons8-back-arrow-48.png"))); // NOI18N
        back.setText("Back");
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back);
        back.setBounds(40, 50, 130, 57);

        option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "ID", "Name" }));
        jPanel2.add(option);
        option.setBounds(410, 250, 230, 40);
        jPanel2.add(employee);
        employee.setBounds(380, 320, 280, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Background/123.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1090, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Menu().setVisible(true);
            }
        });    
    }//GEN-LAST:event_backActionPerformed

    private void EmployeeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeSearchActionPerformed
        if(option.getSelectedItem()=="Select"){
            JOptionPane.showMessageDialog(this,"Please Select One Option for Search! ");
        }else if(option.getSelectedItem()=="ID")
        {
            if(!(employee.getText().isEmpty())){
                String id =employee.getText();
                Connection=objConnectivity.getConnection();
                EmployeeDal emp=new EmployeeDal(Connection);
                Employee e=emp.SearchId(id);
                if(e!=null){
                    RunNextFrame(e);
                }else{
                    JOptionPane.showMessageDialog(this, "Sorry Not Found in Database! ");
                }
            }else{
                JOptionPane.showMessageDialog(this,"Please Fill the Field");
            }
        }else if(option.getSelectedItem()=="Name")
        {
            if(!(employee.getText().isEmpty()))
            {
                String name =employee.getText();
                Connection=objConnectivity.getConnection();
                EmployeeDal emp=new EmployeeDal(Connection);
                Employee e=emp.SearchbyName(name);
                if(e!=null){
                    RunNextFrame(e);
                }else{
                    JOptionPane.showMessageDialog(this, "Sorry Not Found in Database! ");
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Please Fill the Field");
            }
        }
        
    }//GEN-LAST:event_EmployeeSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Employee_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmployeeSearch;
    private javax.swing.JButton back;
    private javax.swing.JTextField employee;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JComboBox<String> option;
    // End of variables declaration//GEN-END:variables

    void RunNextFrame(Employee e){
        dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_SearchProfile(e).setVisible(true);
            }
        });
    }
    void setClear(){
        employee.setText("");
    }
}
