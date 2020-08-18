/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stadium;

import DataAccessLayer.Stadiumdal;
import DatabaseConnectivity.DatabaseConnectivity;
import classes.Stadium;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hamza
 */
public class AddRecord extends javax.swing.JFrame {

    /** Creates new form AddRecord */
    DatabaseConnectivity object;
    private Connection connection;
    public AddRecord() {
        initComponents();
        object=new DatabaseConnectivity();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        area = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        capacity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        owner = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        opened = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        phoneno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        staid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Record");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(410, 10, 240, 100);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 200, 47, 24);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Area");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(310, 260, 50, 20);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 330, 70, 20);

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel1.add(Name);
        Name.setBounds(410, 190, 330, 40);

        area.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(area);
        area.setBounds(410, 250, 330, 40);
        jPanel1.add(Address);
        Address.setBounds(410, 320, 330, 40);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Capacity");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 390, 80, 30);

        capacity.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(capacity);
        capacity.setBounds(410, 380, 330, 40);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Opened");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 450, 70, 20);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Owner");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(310, 510, 70, 20);
        jPanel1.add(owner);
        owner.setBounds(410, 500, 330, 40);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone Number");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(280, 570, 120, 30);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/icons8-add-column-64.png"))); // NOI18N
        jButton1.setText("Press to Add Record");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 630, 270, 60);

        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/icons8-erase-64.png"))); // NOI18N
        jButton2.setText("Press to Clear Record");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(600, 630, 280, 60);
        jPanel1.add(opened);
        opened.setBounds(410, 440, 330, 40);

        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/icons8-back-64.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 20, 190, 70);
        jPanel1.add(phoneno);
        phoneno.setBounds(410, 560, 330, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(310, 140, 40, 14);
        jPanel1.add(staid);
        staid.setBounds(410, 120, 330, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/Kamal.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1070, 710);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StadiumMenu().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            int stadiid =Integer.parseInt(staid.getText());
        String name= Name.getText();
        String sarea=area.getText();
        String saddress=Address.getText();
       int scapacity=Integer.parseInt(capacity.getText());
        java.util.Date date= opened.getDate();
        java.sql.Date d=new java.sql.Date(date.getTime());
        String sowner=owner.getText();
        long spn=Long.parseLong(phoneno.getText());
        
        if(!(name.isEmpty()||sarea.isEmpty()||saddress.isEmpty()||  sowner.isEmpty()))
        {
           connection=object.getConnection();
           Stadiumdal dal= new Stadiumdal(connection);
           Stadium s=new Stadium(stadiid,name,sarea,saddress,scapacity,d,sowner,spn);
           dal.AddRecord(s);
           
           
    }
        
  }catch (Exception e)
        {
         e.printStackTrace();
        
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(!(Name.getText().isEmpty()&&area.getText().isEmpty()&&Address.getText().isEmpty()&&capacity.getText().isEmpty()&&opened.getDateFormatString().isEmpty()&&owner.getText().isEmpty()&&phoneno.getText().isEmpty()))
        
        {  Name.setText("");
        area.setText("");
        Address.setText("");
        area.setText("");
        capacity.setText("");
        opened.setDateFormatString("");
         owner.setText("");
         phoneno.setText("");
        JOptionPane.showMessageDialog(this, "Clear Successfully");
        
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
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField area;
    private javax.swing.JTextField capacity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser opened;
    private javax.swing.JTextField owner;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField staid;
    // End of variables declaration//GEN-END:variables

}