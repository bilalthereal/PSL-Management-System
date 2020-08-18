/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import DataAccessLayer.AirLinedal;
import DatabaseConnectivity.DatabaseConnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hamza
 */
public class DeleteFlight extends javax.swing.JFrame {

    /**
     * Creates new form DeleteFlight
     */
    DatabaseConnectivity object;
    Connection connection;
    public DeleteFlight() {
        initComponents();
         object=new DatabaseConnectivity();
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameorseat = new javax.swing.JComboBox<>();
        nands = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/icons8-back-64.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 40, 170, 70);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Delete Record");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(360, 110, 260, 70);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name or SeatNo");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 320, 130, 30);

        nameorseat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name Or SeatNo", "SeatNo", "Player_Name", " " }));
        jPanel1.add(nameorseat);
        nameorseat.setBounds(310, 220, 400, 60);
        jPanel1.add(nands);
        nands.setBounds(360, 310, 300, 40);

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/icons8-delete-100.png"))); // NOI18N
        jButton2.setText("Press to Delete Record");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(370, 390, 300, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Background/Kamal.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 880, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudAirline().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          if(nameorseat.getSelectedItem()=="Name Or SeatNo"){
            JOptionPane.showMessageDialog(this, "Select Name or Room No");
        }
        else if(nameorseat.getSelectedItem().equals("SeatNo")){
            int Num=Integer.parseInt(nands.getText());
            if(!(nands.getText().isEmpty()))
            {
               connection=object.getConnection();
               AirLinedal dal=new AirLinedal(connection);
               dal.DeleteSno(Num);
               
            
            
            }
        }
       
        else if(nameorseat.getSelectedItem()=="Player_Name")
        {
          String Na=nands.getText();
          if(!(nands.getText().isEmpty()))
          {
             connection=object.getConnection();
               AirLinedal dal=new AirLinedal(connection);
               dal.DeleteName(Na);
             
          
          }
          
        
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
            java.util.logging.Logger.getLogger(DeleteFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> nameorseat;
    private javax.swing.JTextField nands;
    // End of variables declaration//GEN-END:variables
}