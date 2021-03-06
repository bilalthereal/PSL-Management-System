/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team;

import DAL.TeamDal;
import DatabaseConnectivity.DatabaseConnectivity;
import classes.Team;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MUHAMMED BILAL
 */
public class Team_ViewAll extends javax.swing.JFrame {

    /**
     * Creates new form Team_Add
     */
    int i=0;
    DatabaseConnectivity objConnectivity;
    private Connection Connection;
    public Team_ViewAll() {
        initComponents();
        objConnectivity=new DatabaseConnectivity();
        Connection=objConnectivity.getConnection();
        TeamDal dal=new TeamDal(Connection);
        int size=dal.ViewAll().size();
        String[] columnsName = {"Team ID", "Team Name", "Team Mail", "Office Contact No","Founded Date","Team Owner"};
            DefaultTableModel model = (DefaultTableModel) viewall.getModel();
            model.setColumnIdentifiers(columnsName);
            Object[] tableLines = new Object[6];
            for(int i=0;i<size;i++){
                Team objList=dal.ViewAll().get(i);
                tableLines[0]=objList.getId();
                tableLines[1]=objList.getName();
                tableLines[2]=objList.getMail();
                tableLines[3]=objList.getOffice_Contact();
                tableLines[4]=objList.getDate();
                tableLines[5]=objList.getOwner_name();
                model.addRow(tableLines);
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

        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewall = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

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
        back.setBounds(-20, 30, 130, 57);

        viewall.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team ID", "Team Name", "Team Mail", "Office Contact No", "Founded Date", "Team Owner"
            }
        ));
        viewall.setEnabled(false);
        jScrollPane1.setViewportView(viewall);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(90, 0, 1000, 670);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Background/nxUe1y.jpg"))); // NOI18N
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
                new Team_Menu().setVisible(true);
            }
        });
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Team_ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Team_ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Team_ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Team_ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Team_ViewAll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewall;
    // End of variables declaration//GEN-END:variables
}
