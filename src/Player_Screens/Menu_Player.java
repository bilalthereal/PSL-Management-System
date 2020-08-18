package Player_Screens;


import Bid_Manager_Screens.Bid_Manager_Menu;
import DatabaseConnectivity.DatabaseConnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Psl_Classes.Player1;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Menu_Player extends javax.swing.JFrame {

    /**
     * Creates new form Bidding_Menu
     */
    DatabaseConnectivity objConnectivity;
    private Connection connection;
    public Menu_Player() {
        initComponents();
        objConnectivity=new DatabaseConnectivity();
         setExtendedState(JFrame.MAXIMIZED_BOTH);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddPlayer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        search_Txt = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        AddPlayer.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        AddPlayer.setForeground(new java.awt.Color(51, 51, 51));
        AddPlayer.setText("ADD Player");
        AddPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPlayerActionPerformed(evt);
            }
        });
        getContentPane().add(AddPlayer);
        AddPlayer.setBounds(360, 210, 230, 49);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Player Section");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 20, 190, 49);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("View Players Profile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 320, 230, 51);

        jButton8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 51, 51));
        jButton8.setText("Delete_Player");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(360, 380, 230, 49);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(830, 120, 52, 22);
        getContentPane().add(search_Txt);
        search_Txt.setBounds(920, 110, 174, 22);

        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        getContentPane().add(search_btn);
        search_btn.setBounds(960, 150, 65, 23);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 270, 230, 41);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(70, 40, 100, 31);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL_BACKGROUND_PICS/cricket-ball-by-hedgehog-the-hermit-d6sqiom-1600x973.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 10, 1430, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPlayerActionPerformed
        dispose();  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Player_Form(). setVisible(true);
            }
        });
    }//GEN-LAST:event_AddPlayerActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new Delete().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Player().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
         try{
        connection =objConnectivity.getConnection();
        String Search=search_Txt.getText(); 
        String query="( Select *from Player where Playerid= ? )";
        PreparedStatement objPreparedStatement=connection.prepareStatement(query);
        objPreparedStatement.setString(1,Search);
        ResultSet objResultSet;
        objResultSet = objPreparedStatement.executeQuery();
       if(objResultSet.next()){
        Player1  player=new Player1(objResultSet.getString(1),objResultSet.getString(2),objResultSet.getString(3),objResultSet.getString(5),objResultSet.getString(6),objResultSet.getString(7));
         JOptionPane.showMessageDialog(this,"Name = "+player.getPlayerName()+" Id ="+player.getId()+"  Mail "+player.getMail());
        }else{
           JOptionPane.showMessageDialog(this,"Not found");
       }
      
         
      
       
         }catch(Exception e){
             e.printStackTrace();
         }
    }//GEN-LAST:event_search_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          dispose();
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Player().setVisible(true);
            }
        });
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bid_Manager_Menu().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPlayer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField search_Txt;
    private javax.swing.JButton search_btn;
    // End of variables declaration//GEN-END:variables
}